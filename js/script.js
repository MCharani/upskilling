/* 1. JavaScript Basics */

console.log("Welcome to the Community Portal");

window.onload = function()
{
    alert("Page Fully Loaded");
}


/* 2. Data Types and Operators */

const eventName = "Music Event";

const eventDate = "2026-06-10";

let seats = 50;

console.log(`${eventName} on ${eventDate}`);

seats--;

console.log("Remaining Seats:", seats);


/* 3. Conditionals, Loops, Error Handling */

const events = [

{
    name: "Music Event",
    category: "Music",
    seats: 10,
    upcoming: true
},

{
    name: "Old Event",
    category: "Workshop",
    seats: 0,
    upcoming: false
}

];


events.forEach(function(event)
{
    if(event.upcoming && event.seats > 0)
    {
        console.log(event.name);
    }
});


try
{
    let registration = true;

    if(!registration)
    {
        throw "Registration Failed";
    }
}
catch(error)
{
    console.log(error);
}


/* 4. Functions and Closures */

function addEvent(name, category)
{
    events.push({
        name,
        category
    });
}


function registerUser(username)
{
    console.log(username + " Registered");
}


function filterEventsByCategory(category)
{
    return events.filter(
        event => event.category === category
    );
}


function registrationTracker()
{
    let total = 0;

    return function()
    {
        total++;

        return total;
    }
}

const trackMusic = registrationTracker();

console.log(trackMusic());

console.log(trackMusic());


/* 5. Objects and Prototypes */

class Event
{
    constructor(name, seats)
    {
        this.name = name;

        this.seats = seats;
    }
}

Event.prototype.checkAvailability = function()
{
    return this.seats > 0;
}

const newEvent = new Event("Workshop", 20);

console.log(newEvent.checkAvailability());

console.log(Object.entries(newEvent));


/* 6. Arrays and Methods */

const allEvents = [];

allEvents.push("Music Event");

allEvents.push("Workshop on Baking");

const musicEvents = allEvents.filter(
    event => event.includes("Music")
);

console.log(musicEvents);

const cards = allEvents.map(
    event => `Event: ${event}`
);

console.log(cards);


/* 7. DOM Manipulation */

const container =
document.querySelector("#eventContainer");


events.forEach(function(event)
{
    const card =
    document.createElement("div");

    card.innerHTML =
    `
    <h3>${event.name}</h3>

    <p>${event.category}</p>

    <button onclick="register('${event.name}')">
    Register
    </button>
    `;

    container.appendChild(card);
});


function register(name)
{
    alert("Registered for " + name);
}


/* 8. Event Handling */

document.getElementById("categoryFilter")
.onchange = function()
{
    console.log(this.value);
}


document.getElementById("searchBox")
.addEventListener("keydown", function(event)
{
    console.log(event.key);
});


/* 9. Async JS */

fetch("https://jsonplaceholder.typicode.com/posts/1")

.then(response => response.json())

.then(data => console.log(data))

.catch(error => console.log(error));


async function fetchData()
{
    try
    {
        const response =
        await fetch(
        "https://jsonplaceholder.typicode.com/posts/1"
        );

        const data =
        await response.json();

        console.log(data);
    }

    catch(error)
    {
        console.log(error);
    }
}

fetchData();


/* 10. Modern JavaScript */

function greet(name = "Guest")
{
    console.log(name);
}

const eventObj = {

    title: "Music Event",

    location: "Bangalore"
};

const {title, location} = eventObj;

console.log(title, location);

const copiedEvents = [...events];

console.log(copiedEvents);


/* 11. Working with Forms */

const form =
document.getElementById("registerForm");

form.addEventListener("submit",

function(event)
{
    event.preventDefault();

    const username =
    form.elements["username"].value;

    const email =
    form.elements["email"].value;

    const selectedEvent =
    form.elements["event"].value;

    if(username === "" || email === "")
    {
        document.getElementById("message")
        .innerHTML = "All Fields Required";

        return;
    }

    document.getElementById("message")
    .innerHTML =
    `${username} registered for ${selectedEvent}`;
});


/* 12. AJAX & Fetch API */

function submitData()
{
    setTimeout(function()
    {
        fetch(
        "https://jsonplaceholder.typicode.com/posts",

        {
            method: "POST",

            headers:
            {
                "Content-Type": "application/json"
            },

            body: JSON.stringify(
            {
                name: "Charani"
            })
        })

        .then(response => response.json())

        .then(data =>
        {
            console.log("Success", data);
        })

        .catch(error =>
        {
            console.log("Error", error);
        });

    }, 2000);
}

submitData();


/* 13. Debugging */

console.log("Form Submission Started");

console.log("Checking Payload");


/* 14. jQuery */

$('#registerBtn').click(function()
{
    $('#eventContainer').fadeOut(1000);

    $('#eventContainer').fadeIn(1000);
});


/* Framework Benefit */

console.log(
"React and Vue help build reusable UI components"
);