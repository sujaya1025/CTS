import React, { useState } from 'react';

function GuestPage({ onLogin }) {
  const flights = [
    { id: 1, from: 'New York', to: 'London', time: '10:00 AM' },
    { id: 2, from: 'Paris', to: 'Tokyo', time: '3:00 PM' },
    { id: 3, from: 'Sydney', to: 'Dubai', time: '8:00 AM' },
  ];

  return (
    <div>
      <h2>Guest View - Flight Details</h2>
      <ul>
        {flights.map(flight => (
          <li key={flight.id}>
            {flight.from} → {flight.to} at {flight.time}
          </li>
        ))}
      </ul>
      <button onClick={onLogin}>Login</button>
    </div>
  );
}

function UserPage({ onLogout }) {
  const [booking, setBooking] = useState({ from: '', to: '', date: '' });
  const [message, setMessage] = useState('');

  const handleChange = (e) => {
    setBooking(prev => ({ ...prev, [e.target.name]: e.target.value }));
  };

  const handleBook = (e) => {
    e.preventDefault();
    if (!booking.from || !booking.to || !booking.date) {
      alert('Please fill all fields');
      return;
    }
    setMessage(`Ticket booked from ${booking.from} to ${booking.to} on ${booking.date}`);
    setBooking({ from: '', to: '', date: '' });
  };

  return (
    <div>
      <h2>User View - Book Tickets</h2>
      <form onSubmit={handleBook}>
        <input
          name="from"
          placeholder="From"
          value={booking.from}
          onChange={handleChange}
        />
        <input
          name="to"
          placeholder="To"
          value={booking.to}
          onChange={handleChange}
        />
        <input
          type="date"
          name="date"
          value={booking.date}
          onChange={handleChange}
        />
        <button type="submit">Book Ticket</button>
      </form>
      {message && <p style={{ color: 'green' }}>{message}</p>}
      <button onClick={onLogout} style={{ marginTop: '20px' }}>Logout</button>
    </div>
  );
}

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  return (
    <div style={{ padding: 20 }}>
      <h1>Ticket Booking App</h1>
      {isLoggedIn ? (
        <UserPage onLogout={() => setIsLoggedIn(false)} />
      ) : (
        <GuestPage onLogin={() => setIsLoggedIn(true)} />
      )}
    </div>
  );
}

export default App;