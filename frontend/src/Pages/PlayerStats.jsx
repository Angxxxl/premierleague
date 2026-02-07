import { useState, useEffect } from 'react'

function PlayerStats(){
    const [players, setPlayers]=useState([])
    useEffect(() =>{
        fetch('http://localhost:8081/api/v1/player')
            .then(response =>response.json())
            .then(data =>{
                console.log("Datos  recibidos", data)
                setPlayers(data);
            })
            .catch(error => console.error('Error', error));
    },[])
    return(
        <div style={{padding : '20px', fontFamily: 'Arial, sans-serif' }}>
            <h1>Premier League Players</h1>
            {players.length === 0 ? (
                <p>Cargando jugadores...</p>
            ) : (
                <table border="1" style={{ width: '100%', borderCollapse: 'collapse' }}>
                    <thead>
                    <tr style={{ backgroundColor: '#f2f2f2' }}>
                        <th>Nombre</th>
                        <th>Club</th>
                        <th>Posición</th>
                        <th>Nacionalidad</th>
                        <th>Edad</th>
                    </tr>
                    </thead>
                    <tbody>
                    {players.map((player, index) => (
                        <tr key={`${player.full_name}-${index}`}>
                            <td>{player.full_name}</td>
                            <td>{player.Current_Club}</td>
                            <td>{player.position}</td>
                            <td>{player.Nationality}</td>
                            <td>{player.age}</td>
                        </tr>
                    ))}
                    </tbody>
                </table>
            )}

        </div>
    )

}
export default PlayerStats