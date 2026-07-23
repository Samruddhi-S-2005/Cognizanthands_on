import React, { Component } from "react";
import CurrencyConvertor from "./CurrencyConvertor";

class App extends Component {
  constructor(props) {
    super(props);

    this.state = {
      count: 0
    };
  }

  increment = () => {
    this.setState({
      count: this.state.count + 1
    });
  };

  decrement = () => {
    this.setState({
      count: this.state.count - 1
    });
  };

  sayHello = () => {
    alert("Hello! Member1");
  };

  incrementAndHello = () => {
    this.increment();
    this.sayHello();
  };

  sayWelcome = (message) => {
    alert(message);
  };

  handleSyntheticEvent = (e) => {
    alert("I was clicked");
    console.log(e);
  };

  render() {
    return (
      <div style={{ margin: "20px" }}>
        <h2>{this.state.count}</h2>

        <button onClick={this.incrementAndHello}>
          Increment
        </button>

        <br />
        <br />

        <button onClick={this.decrement}>
          Decrement
        </button>

        <br />
        <br />

        <button onClick={() => this.sayWelcome("Welcome")}>
          Say welcome
        </button>

        <br />
        <br />

        <button onClick={this.handleSyntheticEvent}>
          Click on me
        </button>

        <br />
        <br />

        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;