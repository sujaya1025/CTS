import React, { useState } from 'react';

function BookDetails() {
  return (
    <div>
      <h2>Book Details</h2>
      <p>Title: React Basics</p>
      <p>Author: John Doe</p>
    </div>
  );
}

function BlogDetails() {
  return (
    <div>
      <h2>Blog Details</h2>
      <p>Topic: Conditional Rendering in React</p>
      <p>Author: Jane Smith</p>
    </div>
  );
}

function CourseDetails() {
  return (
    <div>
      <h2>Course Details</h2>
      <p>Course Name: React for Beginners</p>
      <p>Duration: 6 weeks</p>
    </div>
  );
}

function App() {
  const [selected, setSelected] = useState('book');

  return (
    <div style={{ padding: '20px' }}>
      <h1>Blogger App</h1>

      <button onClick={() => setSelected('book')}>Show Book Details</button>
      <button onClick={() => setSelected('blog')}>Show Blog Details</button>
      <button onClick={() => setSelected('course')}>Show Course Details</button>

      <hr />


      {selected === 'book' ? <BookDetails /> : null}

      {selected === 'blog' && <BlogDetails />}

      {(() => {
        switch (selected) {
          case 'course':
            return <CourseDetails />;
          default:
            return null;
        }
      })()}
    </div>
  );
}

export default App;