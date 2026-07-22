import React, { Component } from "react";

class CountPeople extends Component {
  constructor() {
    super();

    this.state = {
      entrycount: 0,
      exitcount: 0
    };
  }

  UpdateEntry = () => {
    this.setState((prevState) => ({
      entrycount: prevState.entrycount + 1
    }));
  };

  UpdateExit = () => {
    this.setState((prevState) => ({
      exitcount: prevState.exitcount + 1
    }));
  };

  render() {
    return (
      <div
        style={{
          display: "flex",
          justifyContent: "space-around",
          marginTop: "120px"
        }}
      >
        <div>
          <button
            onClick={this.UpdateEntry}
            style={{
              backgroundColor: "green",
              color: "white"
            }}
          >
            Login
          </button>

          <span> {this.state.entrycount} People Entered!!</span>
        </div>

        <div>
          <button
            onClick={this.UpdateExit}
            style={{
              backgroundColor: "green",
              color: "white"
            }}
          >
            Exit
          </button>

          <span> {this.state.exitcount} People Left!!</span>
        </div>
      </div>
    );
  }
}

export default CountPeople;