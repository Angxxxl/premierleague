import React from 'react';
import { Link } from 'react-router-dom';
import styles from './Home.module.css';


function Home(){
    return(
        <div className={styles.container}>
            <h1>Bienvenido a Premier Fan</h1>
            <p>Estaditicas de la temporada 2018-2019</p>

            <Link to="/teams">
                <button className={styles.button}>Comenzar</button>
            </Link>
        </div>
    );
}
export default Home;