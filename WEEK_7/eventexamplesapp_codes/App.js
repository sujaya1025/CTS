import React, { useState } from 'react';

function App() {
  // Counter state
  const [count, setCount] = useState(0);

  // 1a. Increment function
  const increment = () => {
    setCount(prev => prev + 1);
  };

  // 1b. Say Hello function
  const sayHello = () => {
    alert('Hello! This is a static message.');
  };

  // Increase button invokes multiple methods
  const handleIncreaseClick = () => {
    increment();
    sayHello();
  };

  // 2. Say Welcome function (with argument)
  const sayWelcome = (msg) => {
    alert(msg);
  };

  // 3. Synthetic event onPress (onClick in React)
  const handleClick = () => {
    alert('I was clicked');
  };

  // CurrencyConvertor component state
  const [rupees, setRupees] = useState('');
  const [euros, setEuros] = useState(null);

  // Currency conversion rate (1 INR = 0.011 EUR approx)
  const conversionRate = 0.011;

  // handleSubmit for conversion
  const handleSubmit = (e) => {
    e.preventDefault();
    if (!rupees || isNaN(rupees)) {
      alert('Please enter a valid number for Rupees');
      return;
    }
    const euroValue = (parseFloat(rupees) * conversionRate).toFixed(2);
    setEuros(euroValue);
  };

  return (
    <div style={{ padding: '20px' }}>
      <h1>Event Examples App</h1>

      {/* 1. Increment/Decrement Counter */}
      <h2>Counter: {count}</h2>
      <button onClick={handleIncreaseClick}>Increase</button>
      <button onClick={() => setCount(count - 1)}>Decrement</button>

      {/* 2. Say Welcome button */}
      <div style={{ marginTop: '20px' }}>
        <button onClick={() => sayWelcome('Welcome')}>Say Welcome</button>
      </div>

      {/* 3. Synthetic Event onPress (onClick) */}
      <div style={{ marginTop: '20px' }}>
        <button onClick={handleClick}>Click Me (onPress)</button>
      </div>

      {/* CurrencyConvertor Component */}
      <div style={{ marginTop: '40px' }}>
        <h2>Currency Convertor (INR to Euro)</h2>
        <form onSubmit={handleSubmit}>
          <input
            type="text"
            placeholder="Enter Rupees"
            value={rupees}
            onChange={(e) => setRupees(e.target.value)}
          />
          <button type="submit">Convert</button>
        </form>
        {euros !== null && (
          <p>{rupees} INR = {euros} Euros</p>
        )}
      </div>
    </div>
  );
}

export default App;