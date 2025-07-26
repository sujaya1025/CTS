import React, { Component } from 'react';
import Post from './Post';  // Import Post component

class Posts extends Component {
  constructor(props) {
    super(props);
    // Initializing state with an empty array
    this.state = {
      posts: []
    };
  }

  // Fetching posts from the API
  loadPosts = async () => {
    try {
      const response = await fetch('https://jsonplaceholder.typicode.com/posts');
      const posts = await response.json();
      this.setState({ posts });  // Setting fetched posts into the state
    } catch (error) {
      console.error('Error fetching posts:', error);
    }
  };

  // ComponentDidMount lifecycle hook to call loadPosts after component mounts
  componentDidMount() {
    this.loadPosts();
  }

  // Catching errors in the component
  componentDidCatch(error, info) {
    alert('An error occurred: ' + error);
    console.log(info);
  }

  // Rendering the list of posts
  render() {
    return (
      <div>
        <h1>Posts</h1>
        {this.state.posts.map(post => (
          <Post key={post.id} title={post.title} body={post.body} />
        ))}
      </div>
    );
  }
}

export default Posts;