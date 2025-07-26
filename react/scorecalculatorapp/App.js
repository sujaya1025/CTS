import React from 'react';
import './App.css';  // Importing default styles (optional)
import CalculateScore from './Components/CalculateScore';  // Importing CalculateScore component

function App() {
  return (
    <div className="App">
      <CalculateScore />  {/* Using the CalculateScore component */}
    </div>
  );
}

export default App;