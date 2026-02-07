import React, { useState, useEffect } from 'react';
import { useParams } from 'react-router-dom';
import styles from './TeamPlayers.module.css';

function TeamPlayers() {
    const { teamId } = useParams();
    const [players, setPlayers] = useState([]);
    const [editingPlayer, setEditingPlayer] = useState(null);
    const [filterText, setFilterText] = useState("");

    useEffect(() => {
        fetch(`http://localhost:8081/api/v1/player?Current_club=${teamId}`)
            .then(response => response.json())
            .then(data => setPlayers(data))
            .catch(error => console.error('Error al obtener jugadores:', error));
    }, [teamId]);

    const handleDelete = (name) => {
        if (window.confirm(`¿Seguro que quieres borrar a ${name}?`)) {
            fetch(`http://localhost:8081/api/v1/player/${name}`, { method: 'DELETE' })
                .then(() => setPlayers(players.filter(p => p.full_name !== name)))
                .catch(err => console.error("Error al borrar", err));
        }
    };

    const handleUpdate = (e) => {
        e.preventDefault();
        fetch(`http://localhost:8081/api/v1/player`, {
            method: 'PUT',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(editingPlayer)
        })
            .then(res => res.json())
            .then(updatedData => {
                setPlayers(players.map(p => p.full_name === updatedData.full_name ? updatedData : p));
                setEditingPlayer(null);
            })
            .catch(err => console.error("Error al actualizar", err));
    };

    const filteredPlayers = players.filter(player =>
        player.full_name.toLowerCase().includes(filterText.toLowerCase()) ||
        player.position.toLowerCase().includes(filterText.toLowerCase())
    );

    return (
        <div className={styles.container}>
            <header className={styles.header}>
                <div className={styles.titleInfo}>
                    <h1>{teamId}</h1>
                    <p>Plantilla Temporada 2018/2019</p>
                </div>
                <div className={styles.searchWrapper}>
                    <input
                        type="text"
                        placeholder="Buscar por nombre o posición..."
                        className={styles.playerSearch}
                        value={filterText}
                        onChange={(e) => setFilterText(e.target.value)}
                    />
                </div>
            </header>

            <div className={styles.tableWrapper}>
                <table className={styles.table}>
                    <thead>
                    <tr>
                        <th>Nombre</th>
                        <th>Posición</th>
                        <th>Nacionalidad</th>
                        <th>Apariciones</th>
                        <th>Minutos</th>
                        <th>Goles (L/V)</th>
                        <th>Asistencias</th>
                        <th>Amarillas / Rojas</th>
                        <th>Acciones</th>
                    </tr>
                    </thead>
                    <tbody>
                    {filteredPlayers.length > 0 ? (
                        filteredPlayers.map((player) => (
                            <tr key={player.full_name}>
                                <td className={styles.playerName}>{player.full_name}</td>
                                <td>{player.position}</td>
                                <td>{player.Nationality}</td>
                                <td>{player.appearances_overall}</td>
                                <td>{player.minutes_played_overall}'</td>
                                <td>{player.goals_home} / {player.goals_away}</td>
                                <td>{player.assists_overall}</td>
                                <td>
                                    <span className={styles.yellowCard}>{player.yellow_cards_overall}</span> /
                                    <span className={styles.redCard}> {player.red_cards_overall}</span>
                                </td>
                                <td className={styles.actions}>
                                    <button onClick={() => setEditingPlayer(player)} className={styles.editBtn}>✏️</button>
                                    <button onClick={() => handleDelete(player.full_name)} className={styles.deleteBtn}>🗑️</button>
                                </td>
                            </tr>
                        ))
                    ) : (
                        <tr>
                            <td colSpan="9" className={styles.noResults}>
                                No se encontraron jugadores que coincidan con la búsqueda.
                            </td>
                        </tr>
                    )}
                    </tbody>
                </table>
            </div>

            {editingPlayer && (
                <div className={styles.modalOverlay}>
                    <div className={styles.modalContent}>
                        <h3>Editar a {editingPlayer.full_name}</h3>
                        <form onSubmit={handleUpdate} className={styles.editForm}>
                            <label>Goles Totales:</label>
                            <input
                                type="number"
                                value={editingPlayer.goals_overall}
                                onChange={(e) => setEditingPlayer({
                                    ...editingPlayer,
                                    goals_overall: parseInt(e.target.value) || 0
                                })}
                            />
                            <div className={styles.modalButtons}>
                                <button type="submit" className={styles.saveBtn}>Guardar</button>
                                <button type="button" onClick={() => setEditingPlayer(null)} className={styles.cancelBtn}>Cancelar</button>
                            </div>
                        </form>
                    </div>
                </div>
            )}
        </div>
    );
}

export default TeamPlayers;