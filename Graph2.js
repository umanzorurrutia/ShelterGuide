//const Node = require('./Node'); // Importing Graph2 class from Graph2.js


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
class Graph2 {
    constructor(option) {
        this.adjList = [];
        this.vertices = 0;
        this.targetBuilding = "";

        let nImperial_Ave = this.addNode("Imperial Ave", false);
        let nPark_Blvd = this.addNode("North Park Blvd", false);
        let sPark_Blvd = this.addNode("South Park Blvd", false);
        let n12th_Ave = this.addNode("12th Ave", false);
        let n14th_St = this.addNode("North 14th St", false);
        let s14th_St = this.addNode("South 14th St", false);
        let n16th_St = this.addNode("North 16th St", false);
        let s16th_St = this.addNode("South 16th St", false);
        let n17th_St = this.addNode("North 17th St", false);
        let s17th_St = this.addNode("South 17th St", false);
        let n19th_St = this.addNode("19th St", false);
        let n20th_St = this.addNode("20th St", false);
        let n21st_St = this.addNode("21st St", false);
        let n22nd_St = this.addNode("22nd St", false);
        let n24th_St = this.addNode("24th St", false);
        let n25th_St = this.addNode("25th St", false);
        let n26th_St = this.addNode("26th St", false);
        let n27th_St = this.addNode("27th St", false);
        let n28th_St = this.addNode("28th St", false);
        let n29th_St = this.addNode("29th St", false);
        let n30th_St = this.addNode("30th St", false);
        let nEleventh_Ave = this.addNode("North Eleventh Ave", false);
        let sEleventh_Ave = this.addNode("South Eleventh Ave", false);
        let nTenth_Ave = this.addNode("North Tenth Ave", false);
        let sTenth_Ave = this.addNode("South Tenth Ave", false);
        let nNinth_Ave = this.addNode("North Ninth Ave", false);
        let sNinth_Ave = this.addNode("South Ninth Ave", false);
        let nEighth_Ave = this.addNode("North Eighth Ave", false);
        let sEighth_Ave = this.addNode("South Eighth Ave", false);
        let n7th_Ave = this.addNode("North 7th Ave", false);
        let s7th_Ave = this.addNode("South 7th Ave", false);
        let nSixth_Ave = this.addNode("North Sixth Ave", false);
        let sSixth_Ave = this.addNode("South Sixth Ave", false);
        let nFifth_Ave = this.addNode("North Fifth Ave", false);
        let sFifth_Ave = this.addNode("South Fifth Ave", false);
        let nFourth_Ave = this.addNode("North Fourth Ave", false);
        let sFourth_Ave = this.addNode("South Fourth Ave", false);
        let n3rd_Ave = this.addNode("3rd Ave", false);
        let n2nd_Ave = this.addNode("2nd Ave", false);
        let n1st_Ave = this.addNode("North 1st Ave", false);
        let s1st_Ave = this.addNode("South 1st Ave", false);
        let nFront_St = this.addNode("North Front St", false);
        let sFront_St = this.addNode("South Front St", false);
        let nUnion_St = this.addNode("North Union St", false);
        let sUnion_St = this.addNode("South Union St", false);
        let nState_St = this.addNode("North State St", false);
        let sState_St = this.addNode("South State St", false);
        let nKettner_St = this.addNode("North Kettner St", false);
        let sKettner_St = this.addNode("South Kettner St", false);
        let nPacific_Hwy = this.addNode("North Pacific Hwy", false);
        let sPacific_Hwy = this.addNode("South Pacific Hwy", false);
        let nIndia_St = this.addNode("India St", false);
        let nColumbia_St = this.addNode("Columbia St", false);
        let nL_St = this.addNode("L St", false);
        let nK_St = this.addNode("West K St", false);
        let sK_St = this.addNode("East K St", false);
        let nJ_St = this.addNode("West J St", false);
        let sJ_St = this.addNode("East J St", false);
        let nIsland_Ave = this.addNode("West Island Ave", false);
        let sIsland_Ave = this.addNode("East Island Ave", false);
        let nMarket_St = this.addNode("West Market St", false);
        let sMarket_St = this.addNode("East Market_St", false);
        let nG_St = this.addNode("West G St", false);
        let sG_St = this.addNode("East G St", false);
        let nF_St = this.addNode("West F St", false);
        let sF_St = this.addNode("East F St", false);
        let nE_St = this.addNode("West E St", false);
        let sE_St = this.addNode("East E St", false);
        let nBroadway = this.addNode("West Broadway", false);
        let sBroadway = this.addNode("East Broadway", false);
        let nC_St = this.addNode("West C St", false);
        let sC_St = this.addNode("East C St", false);
        let nB_St = this.addNode("West B St", false);
        let sB_St = this.addNode("East B St", false);
        let nA_St = this.addNode("West A St", false);
        let sA_St = this.addNode("East A St", false);
        let nAsh_St = this.addNode("Ash St", false);
        let nBeech_St = this.addNode("Beech St", false);
        let nCedar_St = this.addNode("Cedar St", false);
        let nElm_St = this.addNode("Elm St", false);
        let nFir_St = this.addNode("Fir St", false);
        let nDate_St = this.addNode("Date St", false);
        let n15th_St = this.addNode("15th St", false);

        // Finish nodes here
        this.finishNode(nImperial_Ave, [sPark_Blvd, n12th_Ave, s14th_St, s16th_St, n17th_St, n19th_St, n20th_St, n21st_St, n22nd_St, n24th_St, n25th_St, n26th_St, n27th_St, n28th_St, n29th_St, n30th_St, n15th_St]);
        this.finishNode(nPark_Blvd, [sBroadway, sC_St, sB_St, sA_St]);
        this.finishNode(sPark_Blvd, [nImperial_Ave, n12th_Ave, nK_St, sTenth_Ave, sEleventh_Ave, sJ_St, sIsland_Ave, sMarket_St, sG_St, sF_St, sE_St]);
        this.finishNode(n12th_Ave, [nImperial_Ave, sPark_Blvd]);
        this.finishNode(n14th_St, [sBroadway, sC_St]);
        this.finishNode(s14th_St, [nImperial_Ave, nK_St, sJ_St, sIsland_Ave, sMarket_St, sG_St, sF_St, sE_St]);
        this.finishNode(n16th_St, [sBroadway, sC_St, sB_St]);
        this.finishNode(s16th_St, [nImperial_Ave, nK_St, sJ_St, sIsland_Ave, sMarket_St, sG_St, sF_St, sE_St]);
        this.finishNode(n17th_St, [sBroadway, sC_St, sB_St]);
        this.finishNode(s17th_St, [nImperial_Ave, nK_St, sJ_St, sIsland_Ave, sMarket_St, sG_St, sF_St, sE_St]);
        this.finishNode(n19th_St, [nImperial_Ave, nL_St, sK_St, sJ_St, sIsland_Ave, sMarket_St, sG_St]);
        this.finishNode(n20th_St, [nImperial_Ave, nL_St, sK_St, sJ_St, sIsland_Ave, sMarket_St, sG_St]);
        this.finishNode(n21st_St, [nImperial_Ave, nL_St, sK_St, sJ_St, sIsland_Ave, sMarket_St, sG_St]);
        this.finishNode(n22nd_St, [nImperial_Ave, nL_St, sK_St, sJ_St, sIsland_Ave, sMarket_St, sG_St]);
        this.finishNode(n24th_St, [nImperial_Ave, nL_St, sK_St, sJ_St, sIsland_Ave, sMarket_St, sG_St]);
        this.finishNode(n25th_St, [nImperial_Ave, nL_St, sK_St, sJ_St, sIsland_Ave, sMarket_St, sG_St]);
        this.finishNode(n26th_St, [nImperial_Ave, nL_St, sK_St, sJ_St, sIsland_Ave, sMarket_St, sG_St]);
        this.finishNode(n27th_St, [nImperial_Ave, nL_St, sK_St, sJ_St, sIsland_Ave, sMarket_St, sG_St]);
        this.finishNode(n28th_St, [nImperial_Ave, nL_St, sK_St, sIsland_Ave, sMarket_St, sG_St]);
        this.finishNode(n29th_St, [nImperial_Ave, nL_St, sK_St, sIsland_Ave, sMarket_St, sG_St]);
        this.finishNode(n30th_St, [nImperial_Ave, nL_St, sK_St]);
        this.finishNode(nEleventh_Ave, [sBroadway, sC_St, sB_St, sA_St, nAsh_St]);
        this.finishNode(sEleventh_Ave, [sPark_Blvd, nK_St, sJ_St, sIsland_Ave, sMarket_St, sG_St, sF_St, sE_St]);
        this.finishNode(nTenth_Ave, [sBroadway, sC_St, sB_St, sA_St, nAsh_St]);
        this.finishNode(sTenth_Ave, [nK_St, sPark_Blvd, sJ_St, sIsland_Ave, sMarket_St, sG_St, sF_St, sE_St]);
       this.finishNode(nNinth_Ave, [sBroadway, sC_St, sB_St, sA_St, nAsh_St, nBeech_St, nCedar_St]);
       this.finishNode(sNinth_Ave, [sJ_St, sIsland_Ave, sMarket_St, sG_St, sF_St, sE_St]);
       this.finishNode(nEighth_Ave, [sBroadway, sC_St, sB_St, sA_St, nAsh_St, nBeech_St, nCedar_St]);
       this.finishNode(sEighth_Ave, [sJ_St, sIsland_Ave, sMarket_St, sG_St, sF_St, sE_St]);
       this.finishNode(n7th_Ave, [nBroadway, nC_St, nB_St, nA_St, nAsh_St, nBeech_St, nCedar_St]);
       this.finishNode(s7th_Ave, [nK_St, nJ_St, nIsland_Ave, nMarket_St, nG_St, nF_St, nE_St]);
       this.finishNode(nSixth_Ave, [nBroadway, nC_St, nB_St, nA_St, nAsh_St, nBeech_St, nCedar_St, nElm_St, nFir_St]);
       this.finishNode(sSixth_Ave, [nK_St, nJ_St, nIsland_Ave, nMarket_St, nG_St, nF_St, nE_St]);
       this.finishNode(nFifth_Ave, [nBroadway, nC_St, nB_St, nA_St, nAsh_St, nBeech_St, nCedar_St, nElm_St, nFir_St]);
       this.finishNode(sFifth_Ave, [nK_St, nJ_St, nIsland_Ave, nMarket_St, nG_St, nF_St, nE_St]);
       this.finishNode(nFourth_Ave, [nBroadway, nC_St, nB_St, nA_St, nAsh_St, nBeech_St, nCedar_St, nElm_St, nFir_St]);
       this.finishNode(sFourth_Ave, [nK_St, nJ_St, nIsland_Ave, nMarket_St, nG_St, nF_St, nE_St]);
       this.finishNode(n3rd_Ave, [nBroadway, nC_St, nB_St, nA_St, nAsh_St, nBeech_St, nCedar_St, nElm_St, nFir_St]);
       this.finishNode(n2nd_Ave, [nBroadway, nC_St, nA_St, nAsh_St, nBeech_St, nCedar_St, nElm_St, nFir_St]);
       this.finishNode(n1st_Ave, [nBroadway, nC_St, nA_St, nAsh_St, nBeech_St, nCedar_St, nElm_St, nFir_St]);
       this.finishNode(s1st_Ave, [nIsland_Ave, nMarket_St, nG_St]);
       this.finishNode(nFront_St, [nBroadway, nC_St, nA_St, nAsh_St, nBeech_St, nCedar_St, nDate_St]);
       this.finishNode(sFront_St, [nIsland_Ave, nMarket_St, nG_St]);
       this.finishNode(nUnion_St, [nBroadway, nC_St, nA_St, nAsh_St, nBeech_St, nCedar_St, nDate_St]);
       this.finishNode(sUnion_St, [nIsland_Ave, nMarket_St, nG_St]);
       this.finishNode(nState_St, [nBroadway, nC_St, nA_St, nAsh_St, nBeech_St, nCedar_St, nDate_St]);
       this.finishNode(sState_St, [nMarket_St, nG_St]);
       this.finishNode(nKettner_St, [nBroadway, nA_St, nAsh_St, nBeech_St, nCedar_St, nDate_St]);
       this.finishNode(sKettner_St, [nG_St]);
       this.finishNode(nPacific_Hwy, [nBroadway, nA_St, nAsh_St, nBeech_St, nCedar_St]);
       this.finishNode(sPacific_Hwy, [nG_St]);
       this.finishNode(nIndia_St, [nBroadway, nC_St, nA_St, nAsh_St, nBeech_St, nCedar_St, nDate_St]);
       this.finishNode(nColumbia_St, [nBroadway, nC_St, nA_St, nAsh_St, nBeech_St, nCedar_St, nDate_St]);
       this.finishNode(nL_St, [n19th_St, n20th_St, n21st_St, n22nd_St, n24th_St, n25th_St, n26th_St, n27th_St, n28th_St, n29th_St, n30th_St]);
       this.finishNode(nK_St, [sPark_Blvd, s14th_St, s16th_St, s17th_St, sEleventh_Ave, sTenth_Ave, s7th_Ave, sSixth_Ave, sFifth_Ave, sFourth_Ave]);
       this.finishNode(sK_St, [n19th_St, n20th_St, n21st_St, n22nd_St, n24th_St, n25th_St, n26th_St, n27th_St, n28th_St, n29th_St, n30th_St]);
       this.finishNode(nJ_St, [s7th_Ave, sSixth_Ave, sFifth_Ave, sFourth_Ave]);
       this.finishNode(sJ_St, [sPark_Blvd, s14th_St, s16th_St, s17th_St, n19th_St, n20th_St, n21st_St, n22nd_St, n24th_St, n25th_St, n26th_St, n27th_St, sEleventh_Ave, sTenth_Ave, sNinth_Ave, sEighth_Ave]);
       this.finishNode(nIsland_Ave, [s7th_Ave, sSixth_Ave, sFifth_Ave, sFourth_Ave, s1st_Ave, sFront_St, sUnion_St]);
       this.finishNode(sIsland_Ave, [sPark_Blvd, s14th_St, s16th_St, s17th_St, n19th_St, n20th_St, n21st_St, n22nd_St, n24th_St, n25th_St, n26th_St, n27th_St, n28th_St, n29th_St, sEleventh_Ave, sTenth_Ave, sNinth_Ave, sEighth_Ave]);
       this.finishNode(nMarket_St, [s7th_Ave, sSixth_Ave, sFifth_Ave, sFourth_Ave, s1st_Ave, sFront_St, sUnion_St, sState_St]);
       this.finishNode(sMarket_St, [sPark_Blvd, s14th_St, s16th_St, s17th_St, n19th_St, n20th_St, n21st_St, n22nd_St, n24th_St, n25th_St, n26th_St, n27th_St, n28th_St, n29th_St, sEleventh_Ave, sTenth_Ave, sNinth_Ave, sEighth_Ave]);
       this.finishNode(nG_St, [s7th_Ave, sSixth_Ave, sFifth_Ave, sFourth_Ave, s1st_Ave, sFront_St, sUnion_St, sState_St, sKettner_St, sPacific_Hwy]);
       this.finishNode(sG_St, [sPark_Blvd, s14th_St, s16th_St, s17th_St, n19th_St, n20th_St, n21st_St, n22nd_St, n24th_St, n25th_St, n26th_St, n27th_St, n28th_St, n29th_St, sEleventh_Ave, sTenth_Ave, sNinth_Ave, sEighth_Ave]);
       this.finishNode(nF_St, [s7th_Ave, sSixth_Ave, sFifth_Ave, sFourth_Ave]);
       this.finishNode(sF_St, [sPark_Blvd, s14th_St, s16th_St, s17th_St, sEleventh_Ave, sTenth_Ave, sNinth_Ave, sEighth_Ave]);
       this.finishNode(nE_St, [s7th_Ave, sSixth_Ave, sFifth_Ave, sFourth_Ave]);
       this.finishNode(sE_St, [sPark_Blvd, s14th_St, s16th_St, s17th_St, sEleventh_Ave, sTenth_Ave, sNinth_Ave, sEighth_Ave]);
       this.finishNode(nBroadway, [n7th_Ave, nSixth_Ave, nFifth_Ave, nFourth_Ave, n3rd_Ave, n2nd_Ave, n1st_Ave, nFront_St, nUnion_St, nState_St, nKettner_St, nPacific_Hwy, nIndia_St, nColumbia_St]);
       this.finishNode(sBroadway, [nPark_Blvd, n14th_St, n16th_St, n17th_St, nEleventh_Ave, nTenth_Ave, nNinth_Ave, nEighth_Ave]);
       this.finishNode(nC_St, [n7th_Ave, nSixth_Ave, nFifth_Ave, nFourth_Ave, n3rd_Ave, n2nd_Ave, n1st_Ave, nFront_St, nUnion_St, nState_St, nIndia_St, nColumbia_St]);
       this.finishNode(sC_St, [nPark_Blvd, n14th_St, n16th_St, n17th_St, nEleventh_Ave, nTenth_Ave, nNinth_Ave, nEighth_Ave]);
       this.finishNode(nB_St, [n7th_Ave, nSixth_Ave, nFifth_Ave, nFourth_Ave, n3rd_Ave]);
       this.finishNode(sB_St, [nPark_Blvd, n16th_St, n17th_St, nEleventh_Ave, nTenth_Ave, nNinth_Ave, nEighth_Ave]);
       this.finishNode(nA_St, [n7th_Ave, nSixth_Ave, nFifth_Ave, nFourth_Ave, n3rd_Ave, n2nd_Ave, n1st_Ave, nFront_St, nUnion_St, nState_St, nKettner_St, nPacific_Hwy, nIndia_St, nColumbia_St]);
       this.finishNode(sA_St, [nPark_Blvd, nEleventh_Ave, nTenth_Ave, nNinth_Ave, nEighth_Ave]);
        
       this.finishNode(nAsh_St, [nEleventh_Ave, nTenth_Ave, nNinth_Ave, nEighth_Ave, n7th_Ave, nSixth_Ave, nFifth_Ave, nFourth_Ave, n3rd_Ave, n2nd_Ave, n1st_Ave, nFront_St, nUnion_St, nState_St, nKettner_St, nPacific_Hwy, nIndia_St, nColumbia_St]);
       this.finishNode(nBeech_St, [nNinth_Ave, nEighth_Ave, n7th_Ave, nSixth_Ave, nFifth_Ave, nFourth_Ave, n3rd_Ave, n2nd_Ave, n1st_Ave, nFront_St, nUnion_St, nState_St, nKettner_St, nPacific_Hwy, nIndia_St, nColumbia_St]);
       this.finishNode(nCedar_St, [nNinth_Ave, nEighth_Ave, n7th_Ave, nSixth_Ave, nFifth_Ave, nFourth_Ave, n3rd_Ave, n2nd_Ave, n1st_Ave, nFront_St, nUnion_St, nState_St, nKettner_St, nPacific_Hwy, nIndia_St, nColumbia_St]);
       this.finishNode(nElm_St, [nSixth_Ave, nFifth_Ave, nFourth_Ave, n3rd_Ave, n2nd_Ave, n1st_Ave]);
       this.finishNode(nFir_St, [nSixth_Ave, nFifth_Ave, nFourth_Ave, n3rd_Ave, n2nd_Ave, n1st_Ave]);
       this.finishNode(nDate_St, [nFront_St, nUnion_St, nState_St, nKettner_St, nIndia_St, nColumbia_St]);
       this.finishNode(n15th_St, [nImperial_Ave]);
        

        if (option === "Homeless Shelter") {
            n15th_St.isTarget = true;
            nElm_St.isTarget = true;
            this.targetBuilding = "Homeless Shelter";
        } else if (option === "Hospital") {
            // Set nodes corresponding to streets with hospitals
            this.targetBuilding = "Hospital";
        } else if (option === "Not sure") {
            // Find another thing
            this.targetBuilding = "Rehab Center";
        }
    }

    addNode(street, target) {
        const temp = new Node(street, [], target);
        this.adjList.push(temp);
        this.vertices++;
        return temp;
    }

    finishNode(temp, neighbors) {
        temp.listNeighbors = neighbors;
    }

    bfs(startNode) {
        const explored = [];
        const frontier = [];
        let answer = "";

        for (let i = 0; i < this.adjList.length; i++) {
            if (this.adjList[i].street === startNode) {
                frontier.push(this.adjList[i]);
            }
        }

        let temp;

        while (frontier.length > 0) {
            temp = frontier.shift();

            if (temp.isTarget) {
                if (!temp.next) {
                    answer = `The Street You Are On Contains A ${this.targetBuilding}.`;
                    return answer;
                } else {
                    const route = [temp];
                    let temp2 = temp.next;
                    if (temp2){
                        route.push(temp2);
                    }
                    while (temp2.next) {
                        route.push(temp2.next);
                        temp2 = temp2.next;
                    }
                    console.log(route);

                    const revRoute = route.reverse();
                    answer += `Start from ${revRoute[0].street}.\n`;

                    for (let i = 1; i < revRoute.length; i++) {
                        answer += `Go to ${revRoute[i].street}.\n`;
                    }
                    answer += `${revRoute[revRoute.length - 1].street} Contains A ${this.targetBuilding}.`;
                    return answer;
                }
            }

            for (let i = 0; i < temp.listNeighbors.length; i++) {
                if (!explored.includes(temp.listNeighbors[i]) && !frontier.includes(temp.listNeighbors[i])) {
                    temp.listNeighbors[i].next = temp;
                    frontier.push(temp.listNeighbors[i]);
                }
            }
            explored.push(temp);
        }
        return "Something went Wrong...";
    }
}


// Main method to handle form submission
function main() {
    // Function to handle form submission
    document.getElementById('myForm').addEventListener('submit', function(event) {
        event.preventDefault(); // Prevent default form submission

        // Get input value from form
        let inputData = document.getElementById('inputData').value;

        // Call function from JavaScript file and pass input data
        let output = processData(inputData);

        // Display output
        document.getElementById('output').textContent = "Route: " + output;
    });

    // Function in JavaScript file to process input data
    function processData(data) {
        // Example processing logic
        let graph = new Graph2("Homeless Shelter");
        let route = graph.bfs(data);
        return route; // Output the route to the console
    }
}

// Call the main method to execute the program
main();


main();