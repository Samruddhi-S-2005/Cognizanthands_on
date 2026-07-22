const IndianTeam = [
  "Sachin",
  "Dhoni",
  "Virat",
  "Rohit",
  "Yuvraj",
  "Raina"
];

const T20Players = [
  "First Player",
  "Second Player",
  "Third Player"
];

const RanjiPlayers = [
  "Fourth Player",
  "Fifth Player",
  "Sixth Player"
];

function OddPlayers([first, , third, , fifth]) {
  return (
    <div>
      <p>First : {first}</p>
      <p>Third : {third}</p>
      <p>Fifth : {fifth}</p>
    </div>
  );
}

function EvenPlayers([, second, , fourth, , sixth]) {
  return (
    <div>
      <p>Second : {second}</p>
      <p>Fourth : {fourth}</p>
      <p>Sixth : {sixth}</p>
    </div>
  );
}

const IndianPlayers = [...T20Players, ...RanjiPlayers];

function ListOfIndianPlayers() {
  return (
    <ul>
      {IndianPlayers.map((player, index) => (
        <li key={index}>Mr. {player}</li>
      ))}
    </ul>
  );
}

export {
  IndianTeam,
  OddPlayers,
  EvenPlayers,
  ListOfIndianPlayers
};