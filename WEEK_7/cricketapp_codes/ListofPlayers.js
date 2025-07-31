import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: 'Virat Kohli', score: 90 },
    { name: 'Rohit Sharma', score: 60 },
    { name: 'MS Dhoni', score: 80 },
    { name: 'KL Rahul', score: 50 },
    { name: 'Hardik Pandya', score: 75 },
    { name: 'Shikhar Dhawan', score: 65 },
    { name: 'Jasprit Bumrah', score: 95 },
    { name: 'Ravindra Jadeja', score: 85 },
    { name: 'Yuzvendra Chahal', score: 40 },
    { name: 'Rishabh Pant', score: 78 },
    { name: 'Bhuvneshwar Kumar', score: 66 }
  ];

  const highScorers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map((p, index) => (
          <li key={index}>{p.name} - {p.score}</li>
        ))}
      </ul>

      <h2>Players with Score less than 70</h2>
      <ul>
        {highScorers.map((p, index) => (
          <li key={index}>{p.name} - {p.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;