import React, { useState } from 'react';

function CalculateScore() {
  // State variables for user inputs and result
  const [name, setName] = useState('');
  const [school, setSchool] = useState('');
  const [total, setTotal] = useState('');
  const [goal, setGoal] = useState('');
  const [average, setAverage] = useState(null);

  // Function to handle score calculation
  const calculateAverage = () => {
    const avg = (parseInt(total) + parseInt(goal)) / 2;
    setAverage(avg);
  };

  return (
    <div className="calculator-container">
      <h1>Student Score Calculator</h1>
      <div>
        <label>Name: </label>
        <input
          type="text"
          value={name}
          onChange={(e) => setName(e.target.value)}
        />
      </div>
      <div>
        <label>School: </label>
        <input
          type="text"
          value={school}
          onChange={(e) => setSchool(e.target.value)}
        />
      </div>
      <div>
        <label>Total Marks: </label>
        <input
          type="number"
          value={total}
          onChange={(e) => setTotal(e.target.value)}
        />
      </div>
      <div>
        <label>Goal Marks: </label>
        <input
          type="number"
          value={goal}
          onChange={(e) => setGoal(e.target.value)}
        />
      </div>
      <button onClick={calculateAverage}>Calculate Average</button>

      {average !== null && (
        <div>
          <h3>Average Score: {average}</h3>
        </div>
      )}
    </div>
  );
}

export default CalculateScore;