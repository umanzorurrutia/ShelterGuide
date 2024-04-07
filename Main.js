const Graph2 = require('./Graph2'); // Importing Graph2 class from Graph2.js

function main(){
    // Use graph with command args, e.g. 28th St
    let graph = new Graph2("Homeless Shelter");
    let route = graph.bfs("North Pacific Hwy");
    console.log(route); // Output the route to the console
}

main();

