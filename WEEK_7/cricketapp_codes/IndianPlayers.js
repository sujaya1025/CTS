import React from 'react';

const IndianPlayers = () => {
  const allPlayers = ['Kohli', 'Rohit', 'Dhoni', 'Rahul', 'Pandya', 'Bumrah'];

  // Destructure using array destructuring
  const [p1, p2, p3, p4, p5, p6] = allPlayers;

  // Odd index players (0, 2, 4)
  const oddTeam = [p1, p3, p5];

  // Even index players (1, 3, 5)
  const evenTeam = [p2, p4, p6];

  // Merge feature of ES6 (Spread operator)
  const T20Players = ['Kohli', 'Rohit', 'Rahul'];
  const RanjiTrophyPlayers = ['Pujara', 'Rahane', 'Jadeja'];
  const allCombinedPlayers = [...T20Players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Odd Team Players (Destructured)</h2>
      <ul>
        {oddTeam.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Even Team Players (Destructured)</h2>
      <ul>
        {evenTeam.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Merged Players (T20 + Ranji Trophy)</h2>
      <ul>
        {allCombinedPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;