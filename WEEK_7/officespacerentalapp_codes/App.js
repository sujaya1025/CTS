import React from 'react';

function App() {
  const office1 = {
    name: 'WeWork Space',
    rent: 55000,
    address: 'Bengaluru, India'
  };

  const offices = [
    {
      name: 'Regus Business Center',
      rent: 45000,
      address: 'Hyderabad, India',
      image: 'https://officesnapshots.com/wp-content/uploads/2025/07/swinerton-builders-offices-spokane-1-700x482-compact.jpg'
    },
    {
      name: 'Awfis Premium Office',
      rent: 75000,
      address: 'Delhi, India',
      image: 'https://5.imimg.com/data5/SELLER/Default/2024/8/444961465/OP/RR/KS/2504350/office-interior-decoration.jpg'
    },
    {
      name: 'Innov8 Coworking',
      rent: 62000,
      address: 'Mumbai, India',
      image: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQUkmQ-ydz2hfMgTEs64uncfqvah2zOcIGKPw&s'
    }
  ];

  const getRentStyle = (rent) => ({
    color: rent < 60000 ? 'red' : 'green',
    fontWeight: 'bold'
  });

  return (
    <div>
      {/* JSX Heading */}
      <h1>Office Space Rental App</h1>

      {/* JSX Image for single office */}
      <h2>{office1.name}</h2>
      <p style={getRentStyle(office1.rent)}>Rent: ₹{office1.rent}</p>
      <p>Address: {office1.address}</p>

      <hr />

      {/* Loop through multiple office items */}
      <h2>Available Office Spaces:</h2>
      {offices.map((office, index) => (
        <div key={index} style={{ border: '1px solid #ccc', padding: '10px', marginBottom: '10px' }}>
          <h3>{office.name}</h3>
          <img src={office.image} alt="Office" width="150" />
          <p style={getRentStyle(office.rent)}>Rent: ₹{office.rent}</p>
          <p>Address: {office.address}</p>
        </div>
      ))}
    </div>
  );
}

export default App;