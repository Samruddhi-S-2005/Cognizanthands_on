import { useState } from "react";

function Register() {

    const [name, setName] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");

    const [errors, setErrors] = useState({
        name: "",
        email: "",
        password: ""
    });

    const validate = (field, value) => {

        let temp = { ...errors };

        switch (field) {

            case "name":
                temp.name =
                    value.length < 5
                        ? "Name must be 5 characters long!"
                        : "";
                break;

            case "email":
                temp.email =
                    value.includes("@") && value.includes(".")
                        ? ""
                        : "Email is not valid";
                break;

            case "password":
                temp.password =
                    value.length < 8
                        ? "Password must be 8 characters long!"
                        : "";
                break;

            default:
                break;
        }

        setErrors(temp);
    };

    const handleSubmit = (e) => {

        e.preventDefault();

        if (errors.name !== "") {
            alert(errors.name);
            return;
        }

        if (errors.email !== "") {
            alert(errors.email);
            return;
        }

        if (errors.password !== "") {
            alert(errors.password);
            return;
        }

        if (name === "" || email === "" || password === "") {
            alert("Please fill all fields");
            return;
        }

        alert("Valid Form");
    };

    return (

        <div style={{ marginTop: "80px", marginLeft: "300px" }}>

            <h1 style={{ color: "red" }}>
                Register Here!!!
            </h1>

            <form onSubmit={handleSubmit}>

                <table>

                    <tbody>

                        <tr>
                            <td>Name:</td>
                            <td>

                                <input
                                    type="text"
                                    value={name}
                                    onChange={(e) => {
                                        setName(e.target.value);
                                        validate("name", e.target.value);
                                    }}
                                />

                            </td>
                        </tr>

                        <tr>
                            <td>Email:</td>
                            <td>

                                <input
                                    type="text"
                                    value={email}
                                    onChange={(e) => {
                                        setEmail(e.target.value);
                                        validate("email", e.target.value);
                                    }}
                                />

                            </td>
                        </tr>

                        <tr>
                            <td>Password:</td>
                            <td>

                                <input
                                    type="password"
                                    value={password}
                                    onChange={(e) => {
                                        setPassword(e.target.value);
                                        validate("password", e.target.value);
                                    }}
                                />

                            </td>
                        </tr>

                        <tr>
                            <td></td>
                            <td>

                                <button type="submit">
                                    Submit
                                </button>

                            </td>
                        </tr>

                    </tbody>

                </table>

            </form>

        </div>
    );
}

export default Register;