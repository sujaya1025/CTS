import React from 'react';
import Home from './Components/Home';
//import Home from './Components/Home';  // Importing the Home component
import About from './Components/About';  // Importing the About component
import Contact from './Components/Contact';  // Importing the Contact component

function App() {
  return (
    <div className="App">
      <Home />  {/* Calling Home Component */}
      <About />  {/* Calling About Component */}
      <Contact />  {/* Calling Contact Component */}
    </div>
  );
}

export default App;