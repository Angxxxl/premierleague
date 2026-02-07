import React from 'react';
import { Link } from 'react-router-dom';
import styles from './Teams.module.css';
import { useState, useEffect } from 'react'


function Teams(){
    const[teams, setTeams]=useState([])
    const [searchTerm, setSearchTerm] = useState("");


    useEffect(() =>{
        fetch('http://localhost:8081/api/v1/team')
            .then(response =>response.json())
            .then(data =>{
                console.log("Datos  recibidos", data)
                setTeams(data);
            })
            .catch(error => console.error('Error', error));
    },[])
    const filteredTeams = teams
        .filter(team =>
            team.name.toLowerCase().includes(searchTerm.toLowerCase())
        )
        .filter((team, index, self) =>
            index === self.findIndex((t) => t.name === team.name)
        );
    const searchResults = teams.filter(team =>
        team.name.toLowerCase().includes(searchTerm.toLowerCase())
    );
    return (
        <div className={styles.container}>
            <div className={styles.topSection}>
                <h1 className={styles.title}>Premier League Teams</h1>
                <div className={styles.searchWrapper}>
                    <input
                        type="text"
                        placeholder=" Buscar tu equipo favorito..."
                        className={styles.searchBar}
                        value={searchTerm}
                        onChange={(e) => setSearchTerm(e.target.value)}
                    />
                </div>
            </div>

            {/* La cuadrícula de equipos debajo */}
            <div className={styles.grid}>
                {filteredTeams.map(team => (
                    <Link to={`/teams/${team.name}`} key={team.id} className={styles.cardLink}>
                        <div className={styles.card}>
                            <h3 className={styles.teamName}>{team.name}</h3>
                            <img
                                src={team.imageTeam}
                                alt={team.name}
                                className={styles.image}
                            />
                        </div>
                    </Link>
                ))}
            </div>
        </div>
    );
}
export default Teams;