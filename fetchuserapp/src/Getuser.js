import React, { Component } from "react";

class Getuser extends Component {

    constructor(props) {
        super(props);

        this.state = {
            person: {}
        };
    }

    async componentDidMount() {

        const response = await fetch("https://api.randomuser.me/");
        const data = await response.json();

        this.setState({
            person: data.results[0]
        });
    }

    render() {

        const { person } = this.state;

        if (!person.name) {
            return <h2>Loading...</h2>;
        }

        return (

            <div style={{ textAlign: "center", marginTop: "50px" }}>

                <h2>User Details</h2>

                <img
                    src={person.picture.large}
                    alt="User"
                />

                <h3>
                    {person.name.title} {person.name.first}
                </h3>

            </div>

        );
    }
}

export default Getuser;