class Node {
    constructor(inputStreet, inputlistNeighbors, inputisTarget) {
        this.street = inputStreet;
        this.listNeighbors = inputlistNeighbors || [];
        this.isTarget = inputisTarget || false;
        this.next = null;
    }

    setListNeighbors(listNeighbors) {
        this.listNeighbors = listNeighbors;
    }

    setisTarget(b) {
        this.isTarget = b;
    }
}

module.exports = Node; // Exporting the Graph2 class for use in other files
