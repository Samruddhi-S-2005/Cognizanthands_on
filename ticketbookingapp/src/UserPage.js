import React from "react";

function UserPage() {
  return (
    <div>
      <h2>Welcome back</h2>

      <h3>Ticket Booking</h3>

      <table border="1" cellPadding="8">
        <thead>
          <tr>
            <th>Flight</th>
            <th>Seat</th>
            <th>Status</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>AI-202</td>
            <td>12A</td>
            <td>Booked</td>
          </tr>

          <tr>
            <td>6E-101</td>
            <td>18C</td>
            <td>Booked</td>
          </tr>
        </tbody>
      </table>
    </div>
  );
}

export default UserPage;