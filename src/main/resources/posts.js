fetch("http://localhost:8080/movies", {
	method: 'POST',
	headers: {
		'Content-Type': 'application/json'
	},
	redirect: 'follow',
	body: JSON.stringify([    {
		"title": "Black hawk down",
		"rating": "5",
		"poster": "https://m.media-amazon.com/images/M/MV5BYWMwMzQxZjQtODM1YS00YmFiLTk1YjQtNzNiYWY1MDE4NTdiXkEyXkFqcGdeQXVyNDYyMDk5MTU@._V1_SX300.jpg",
		"year": "2001",
		"genre": "Drama, History, War",
		"director": "Ridley Scott",
		"plot": "160 elite U.S. soldiers drop into Somalia to capture two top lieutenants of a renegade warlord and find themselves in a desperate battle with a large force of heavily-armed Somalis.",
		"actors": "Josh Hartnett, Ewan McGregor, Tom Sizemore, Eric Bana",
		"id": 1
	},
		{
			"title": "Resident Evil",
			"rating": "5",
			"poster": "https://m.media-amazon.com/images/M/MV5BZmI1ZGRhNDYtOGVjZC00MmUyLThlNTktMTQyZGE3MzE1ZTdlXkEyXkFqcGdeQXVyNDE5MTU2MDE@._V1_SX300.jpg",
			"year": "2002",
			"genre": "Action, Horror, Sci-Fi",
			"director": "Paul W.S. Anderson",
			"plot": "A special military unit fights a powerful, out-of-control supercomputer and hundreds of scientists who have mutated into flesh-eating creatures after a laboratory accident.",
			"actors": "Ryan McCluskey, Oscar Pearce, Indra Ové, Anna Bolt",
			"id": 2
		},
		{
			"title": "Tenet",
			"rating": "5",
			"year": "2020",
			"genre": "Action,Drama",
			"director": "Christopher Nolan",
			"plot": "It's the story of a secret agent who learns to manipulate the flow of time to prevent an attack from the future that threatens to annihilate the present.",
			"actors": "Robert Pattinson, Elizabeth Debicki, John David Washington",
			"poster": "https://m.media-amazon.com/images/M/MV5BYzg0NGM2NjAtNmIxOC00MDJmLTg5ZmYtYzM0MTE4NWE2NzlhXkEyXkFqcGdeQXVyMTA4NjE0NjEy._V1_.jpg",
			"id": 3
		},
		{
			"title": "Fast and Furious",
			"rating": "5",
			"year": "2001",
			"genre": "fast, furious",
			"director": "Rob Cohen",
			"plot": "Dominic Toretto (Vin Diesel) enjoys the adrenaline of street car racing and his fans treat him like a rock star. After a blazing encounter with the ruthless Johnny Tran, Dom decides to take Brian (Paul Walker), a newcomer to street racing, under his wing. Dom's sister Mia sees something she likes in Brian, too. Trouble is, neither of them realize he's an undercover cop, and Dominic and his rival Johnny Tran are both the prime suspects in a case involving dirty money and big-rig hijacking.",
			"actors": "Paul Walker, Vin Diesel, Michelle Rodriguez",
			"poster": "https://cdn.shopify.com/s/files/1/0969/9128/products/Fast_Furious_1_-_Paul_Walker_-_Vin_Diesel_-_Tallenge_Hollywood_Action_Movie_Poster_a77ac65b-b502-4ff4-b0b2-008b4704092f.jpg?v=1582542989",
			"id": 4
		},
		{
			"id": 5,
			"title": "Brother Bear",
			"rating": 5,
			"year": 2004,
			"poster": "https://flxt.tmsimg.com/assets/p33159_p_v10_aa.jpg",
			"genre": "family",
			"actors": "Joaquin Pheonix ",
			"director": "Aaron Blaise",
			"plot": "He turns into a bear",
		}])
}).then(function(response) {
	return response.json();
}).then(function(data) {
	console.log(data);
});