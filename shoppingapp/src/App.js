import ListOfPlayers from "./ListOfPlayers";

import {
  IndianTeam,
  OddPlayers,
  EvenPlayers,
  ListOfIndianPlayers
} from "./IndianPlayers";

function App() {

  const flag = false;

  if (flag) {

    return (
      <div>

        <ListOfPlayers />

      </div>
    );

  } else {

    return (
      <div>

        <h1>Odd Players</h1>
        {OddPlayers(IndianTeam)}

        <hr />

        <h1>Even Players</h1>
        {EvenPlayers(IndianTeam)}

        <hr />

        <h1>List of Indian Players Merged:</h1>
        <ListOfIndianPlayers />

      </div>
    );

  }
}

export default App;