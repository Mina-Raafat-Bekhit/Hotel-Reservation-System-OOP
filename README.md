# Hotel Reservation System OOP

A Java Console Application built to demonstrate solid Object-Oriented Programming (OOP) concepts by simulating a comprehensive hotel management and booking platform.

##  Architecture & OOP Design

The project features a modular multi-class architecture designed around real-world hotel operations, ensuring encapsulation and clear separation of concerns:
* **User & Authentication Core:** `User`, `Customer`, `Account`, and `LoginSystem` handling identities and login states.
* **Operations & Booking:** `BookingManager` and `CheckInOut` executing reservations and checking guests in/out.
* **Hotel Management:** `HotelReservationSystem`, `Room`, and `RoomFee` responsible for room allocation and pricing models.

##  Core Features

* Full simulation of hotel room browsing, allocation, and availability tracking.
* Dynamic fee calculation handling checkout processes and room rates.
* Multi-user role handling (Customers and Management/System actions).

##  Future Improvements
*This project is an ongoing learning milestone. Future updates will include:*

* **Enhanced Validation:** Implementing strict check controls in `LoginSystem` to prevent duplicate usernames with different passwords during registration.
* **Control Flow Optimization:** Refining the main application loop to ensure smooth termination when selecting the `Exit` trigger.
