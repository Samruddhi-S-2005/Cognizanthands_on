import React from "react";

function GuestPage() {
  return (
    <div>
      <h2>Please sign up.</h2>

      <h3>Flight Details</h3>

      <table border="1" cellPadding="8">
        <thead>
          <tr>
            <th>Flight</th>
            <th>From</th>
            <th>To</th>
            <th>Time</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>AI-202</td>
            <td>Bangalore</td>
            <td>Delhi</td>
            <td>09:00 AM</td>
          </tr>

          <tr>
            <td>6E-101</td>
            <td>Chennai</td>
            <td>Mumbai</td>
            <td>11:30 AM</td>
          </tr>

          <tr>
            <td>UK-909</td>
            <td>Hyderabad</td>
            <td>Kolkata</td>
            <td>06:45 PM</td>
          </tr>
        </tbody>
      </table>
    </div>
  );
}

export default GuestPage;