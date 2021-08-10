fetch("http://localhost:8080/movies", {
	method: 'POST',
	headers: {
		'Content-Type': 'application/json'
	},
	redirect: 'follow',
	body: JSON.stringify([
		{
			"id": 1,
			"title": "Brother Bear",
			"rating": 5,
			"year": 2004,
			"poster": "https://flxt.tmsimg.com/assets/p33159_p_v10_aa.jpg",
			"genre": "family",
			"actors": "Joaquin Pheonix ",
			"director": "Aaron Blaise",
			"plot": "He turns into a bear",
		}])
})
	.then(Response => Response.json())
	.then(data => console.log(data));


fetch("http://localhost:8080/movies", {
	method: 'POST',
	headers: {
		'Content-Type': 'application/json'
	},
	redirect: 'follow',
	body: JSON.stringify([
		{
			"id": 1,
			"title": "Brother Bear",
			"rating": 5,
			"year": 2004,
			"poster": "https://flxt.tmsimg.com/assets/p33159_p_v10_aa.jpg",
			"genre": "family",
			"actors": "Joaquin Pheonix ",
			"director": "Aaron Blaise",
			"plot": "He turns into a bear"
		}
	])
}).then(function(response) {
	return response.json();
}).then(function(data) {
	console.log(data);
});