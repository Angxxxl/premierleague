import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Home from './Pages/Home';
import PlayerStats from './Pages/PlayerStats';
import Teams from "./Pages/Teams.jsx";
import TeamPlayers from "./Pages/TeamPlayers.jsx";

function App() {
    return (
        <Router>
            <Routes>
                {/* Ruta 1: Cuando entran a la raíz (/), muestra el Home */}
                <Route path="/" element={<Home />} />

                <Route path="/players" element={<PlayerStats />} />

                <Route path="/teams" element={<Teams/>}/>
                <Route path="/teams/:teamId" element={<TeamPlayers />} />
            </Routes>
        </Router>
    );
}

export default App;