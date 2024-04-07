package src.backend;

import java.util.ArrayList;

/*
 * 
 */

public class Graph {
    

    int vertices;
    ArrayList<Node> adjList;
    String targetBuilding = "";

    public Graph(String option) {
        //Construct the entirety of the all nodes
        //Sample Node (NOT REAL DATA)
        
        this.adjList = new ArrayList<>();
        
        this.vertices = 0;
        //Add Nodes here
        Node nImperial_Ave = addNode("Imperial Ave", false);
        Node nPark_Blvd = addNode("North Park Blvd", false);
        Node sPark_Blvd = addNode("South Park Blvd", false);
        Node n12th_Ave = addNode("12th Ave", false);
        Node n14th_St = addNode("North 14th St", false);
        Node s14th_St = addNode("South 14th St", false);
        Node n16th_St = addNode("North 16th St", false);
        Node s16th_St = addNode("South 16th St", false);
        Node n17th_St = addNode("North 17th St", false);
        Node s17th_St = addNode("South 17th St", false);
        Node n19th_St = addNode("19th St", false);
        Node n20th_St = addNode("20th St", false);
        Node n21st_St = addNode("21st St", false);
        Node n22nd_St = addNode("22nd St", false);
        Node n24th_St = addNode("24th St", false);
        Node n25th_St = addNode("25th St", false);
        Node n26th_St = addNode("26th St", false);
        Node n27th_St = addNode("27th St", false);
        Node n28th_St = addNode("28th St", false);
        Node n29th_St = addNode("29th St", false);
        Node n30th_St = addNode("30th St", false);
        Node nEleventh_Ave = addNode("North Eleventh Ave", false);
        Node sEleventh_Ave = addNode("South Eleventh Ave", false);
        Node nTenth_Ave = addNode("North Tenth Ave", false);
        Node sTenth_Ave = addNode("South Tenth Ave", false);
        Node nNinth_Ave = addNode("North Ninth Ave", false);
        Node sNinth_Ave = addNode("South Ninth Ave", false);
        Node nEighth_Ave = addNode("North Eighth Ave", false);
        Node sEighth_Ave = addNode("South Eighth Ave", false);
        Node n7th_Ave = addNode("North 7th Ave", false);
        Node s7th_Ave = addNode("South 7th Ave", false);
        Node nSixth_Ave = addNode("North Sixth Ave", false);
        Node sSixth_Ave = addNode("South Sixth Ave", false);
        Node nFifth_Ave = addNode("North Fifth Ave", false);
        Node sFifth_Ave = addNode("South Fifth Ave", false);
        Node nFourth_Ave = addNode("North Fourth Ave", false);
        Node sFourth_Ave = addNode("South Fourth Ave", false);
        Node n3rd_Ave = addNode("3rd Ave", false);
        Node n2nd_Ave = addNode("2nd Ave", false);
        Node n1st_Ave = addNode("North 1st Ave", false);
        Node s1st_Ave = addNode("South 1st Ave", false);
        Node nFront_St = addNode("North Front St", false);
        Node sFront_St = addNode("South Front St", false);
        Node nUnion_St = addNode("North Union St", false);
        Node sUnion_St = addNode("South Union St", false);
        Node nState_St = addNode("North State St", false);
        Node sState_St = addNode("South State St", false);
        Node nKettner_St = addNode("North Kettner St", false);
        Node sKettner_St = addNode("South Kettner St", false);
        Node nPacific_Hwy = addNode("North Pacific Hwy", false);
        Node sPacific_Hwy = addNode("South Pacific Hwy", false);
        Node nIndia_St = addNode("India St", false);
        Node nColumbia_St = addNode("Columbia St", false);

        Node nL_St = addNode("L St", false);
        Node nK_St = addNode("West K St", false);
        Node sK_St = addNode("East K St", false);
        Node nJ_St = addNode("West J St", false);
        Node sJ_St = addNode("East J St", false);
        Node nIsland_Ave = addNode("West Island Ave", false);
        Node sIsland_Ave = addNode("East Island Ave", false);
        Node nMarket_St = addNode("West Market St", false);
        Node sMarket_St = addNode("East Market_St", false);
        Node nG_St = addNode("West G St", false);
        Node sG_St = addNode("East G St", false);
        Node nF_St = addNode("West F St", false);
        Node sF_St = addNode("East F St", false);
        Node nE_St = addNode("West E St", false);
        Node sE_St = addNode("East E St", false);
        Node nBroadway = addNode("West Broadway", false);
        Node sBroadway = addNode("East Broadway", false);
        Node nC_St = addNode("West C St", false);
        Node sC_St = addNode("East C St", false);
        Node nB_St = addNode("West B St", false);
        Node sB_St = addNode("East B St", false);
        Node nA_St = addNode("West A St", false);
        Node sA_St = addNode("East A St", false);
        Node nAsh_St = addNode("Ash St", false);
        Node nBeech_St = addNode("Beech St", false);
        Node nCedar_St = addNode("Cedar St", false);
        Node nElm_St = addNode("Elm St", false);
        Node nFir_St = addNode("Fir St", false);
        Node nDate_St = addNode("Date St", false);
        Node n15th_St = addNode("15th St", false);
        
        


        //Finish Nodes here
        finishNode(nImperial_Ave, new Node[]{sPark_Blvd, n12th_Ave, s14th_St, s16th_St, n17th_St, n19th_St, n20th_St, n21st_St, n22nd_St, n24th_St, n25th_St, n26th_St, n27th_St, n28th_St, n29th_St, n30th_St,n15th_St});
        finishNode(nPark_Blvd, new Node[]{sBroadway, sC_St, sB_St, sA_St});
        finishNode(sPark_Blvd, new Node[]{nImperial_Ave, n12th_Ave, nK_St, sTenth_Ave, sEleventh_Ave, sJ_St, sIsland_Ave, sMarket_St, sG_St, sF_St, sE_St});
        finishNode(n12th_Ave, new Node[]{nImperial_Ave, sPark_Blvd});
        finishNode(n14th_St, new Node[]{sBroadway, sC_St});
        finishNode(s14th_St, new Node[]{nImperial_Ave, nK_St, sJ_St, sIsland_Ave, sMarket_St, sG_St, sF_St, sE_St});
        finishNode(n16th_St, new Node[]{sBroadway, sC_St, sB_St});
        finishNode(s16th_St, new Node[]{nImperial_Ave, nK_St, sJ_St, sIsland_Ave, sMarket_St, sG_St, sF_St, sE_St});
        finishNode(n17th_St, new Node[]{sBroadway, sC_St, sB_St});
        finishNode(s17th_St, new Node[]{nImperial_Ave, nK_St, sJ_St, sIsland_Ave, sMarket_St, sG_St, sF_St, sE_St});
        finishNode(n19th_St, new Node[]{nImperial_Ave, nL_St, sK_St, sJ_St, sIsland_Ave, sMarket_St, sG_St});
        finishNode(n20th_St, new Node[]{nImperial_Ave, nL_St, sK_St, sJ_St, sIsland_Ave, sMarket_St, sG_St});
        finishNode(n21st_St, new Node[]{nImperial_Ave, nL_St, sK_St, sJ_St, sIsland_Ave, sMarket_St, sG_St});
        finishNode(n22nd_St, new Node[]{nImperial_Ave, nL_St, sK_St, sJ_St, sIsland_Ave, sMarket_St, sG_St});
        finishNode(n24th_St, new Node[]{nImperial_Ave, nL_St, sK_St, sJ_St, sIsland_Ave, sMarket_St, sG_St});
        finishNode(n25th_St, new Node[]{nImperial_Ave, nL_St, sK_St, sJ_St, sIsland_Ave, sMarket_St, sG_St});
        finishNode(n26th_St, new Node[]{nImperial_Ave, nL_St, sK_St, sJ_St, sIsland_Ave, sMarket_St, sG_St});
        finishNode(n27th_St, new Node[]{nImperial_Ave, nL_St, sK_St, sJ_St, sIsland_Ave, sMarket_St, sG_St});
        finishNode(n28th_St, new Node[]{nImperial_Ave, nL_St, sK_St, sIsland_Ave, sMarket_St, sG_St});
        finishNode(n29th_St, new Node[]{nImperial_Ave, nL_St, sK_St, sIsland_Ave, sMarket_St, sG_St});
        finishNode(n30th_St, new Node[]{nImperial_Ave, nL_St, sK_St});
        finishNode(nEleventh_Ave, new Node[]{sBroadway, sC_St, sB_St, sA_St, nAsh_St});
        finishNode(sEleventh_Ave, new Node[]{sPark_Blvd, nK_St, sJ_St, sIsland_Ave, sMarket_St, sG_St, sF_St, sE_St});
        finishNode(nTenth_Ave, new Node[]{sBroadway, sC_St, sB_St, sA_St, nAsh_St});
        finishNode(sTenth_Ave, new Node[]{nK_St, sPark_Blvd, sJ_St, sIsland_Ave, sMarket_St, sG_St, sF_St, sE_St});
        finishNode(nNinth_Ave, new Node[]{sBroadway, sC_St, sB_St, sA_St, nAsh_St, nBeech_St, nCedar_St});
        finishNode(sNinth_Ave, new Node[]{sJ_St, sIsland_Ave, sMarket_St, sG_St, sF_St, sE_St});
        finishNode(nEighth_Ave, new Node[]{sBroadway, sC_St, sB_St, sA_St, nAsh_St, nBeech_St, nCedar_St});
        finishNode(sEighth_Ave, new Node[]{sJ_St, sIsland_Ave, sMarket_St, sG_St, sF_St, sE_St});
        finishNode(n7th_Ave, new Node[]{nBroadway, nC_St, nB_St, nA_St, nAsh_St, nBeech_St, nCedar_St});
        finishNode(s7th_Ave, new Node[]{nK_St, nJ_St, nIsland_Ave, nMarket_St, nG_St, nF_St, nE_St});
        finishNode(nSixth_Ave, new Node[]{nBroadway, nC_St, nB_St, nA_St, nAsh_St, nBeech_St, nCedar_St, nElm_St, nFir_St});
        finishNode(sSixth_Ave, new Node[]{nK_St, nJ_St, nIsland_Ave, nMarket_St, nG_St, nF_St, nE_St});
        finishNode(nFifth_Ave, new Node[]{nBroadway, nC_St, nB_St, nA_St, nAsh_St, nBeech_St, nCedar_St, nElm_St, nFir_St});
        finishNode(sFifth_Ave, new Node[]{nK_St, nJ_St, nIsland_Ave, nMarket_St, nG_St, nF_St, nE_St});
        finishNode(nFourth_Ave, new Node[]{nBroadway, nC_St, nB_St, nA_St, nAsh_St, nBeech_St, nCedar_St, nElm_St, nFir_St});
        finishNode(sFourth_Ave, new Node[]{nK_St, nJ_St, nIsland_Ave, nMarket_St, nG_St, nF_St, nE_St});
        finishNode(n3rd_Ave, new Node[]{nBroadway, nC_St, nB_St, nA_St, nAsh_St, nBeech_St, nCedar_St, nElm_St, nFir_St});
        finishNode(n2nd_Ave, new Node[]{nBroadway, nC_St, nA_St, nAsh_St, nBeech_St, nCedar_St, nElm_St, nFir_St});
        finishNode(n1st_Ave, new Node[]{nBroadway, nC_St, nA_St, nAsh_St, nBeech_St, nCedar_St, nElm_St, nFir_St});
        finishNode(s1st_Ave, new Node[]{nIsland_Ave, nMarket_St, nG_St});
        finishNode(nFront_St, new Node[]{nBroadway, nC_St, nA_St, nAsh_St, nBeech_St, nCedar_St, nDate_St});
        finishNode(sFront_St, new Node[]{nIsland_Ave, nMarket_St, nG_St});
        finishNode(nUnion_St, new Node[]{nBroadway, nC_St, nA_St, nAsh_St, nBeech_St, nCedar_St, nDate_St});
        finishNode(sUnion_St, new Node[]{nIsland_Ave, nMarket_St, nG_St});
        finishNode(nState_St, new Node[]{nBroadway, nC_St, nA_St, nAsh_St, nBeech_St, nCedar_St, nDate_St});
        finishNode(sState_St, new Node[]{nMarket_St, nG_St});
        finishNode(nKettner_St, new Node[]{nBroadway, nA_St, nAsh_St, nBeech_St, nCedar_St, nDate_St});
        finishNode(sKettner_St, new Node[]{nG_St});
        finishNode(nPacific_Hwy, new Node[]{nBroadway, nA_St, nAsh_St, nBeech_St, nCedar_St});
        finishNode(sPacific_Hwy, new Node[]{nG_St});
        finishNode(nIndia_St, new Node[]{nBroadway, nC_St, nA_St, nAsh_St, nBeech_St, nCedar_St, nDate_St});
        finishNode(nColumbia_St, new Node[]{nBroadway, nC_St, nA_St, nAsh_St, nBeech_St, nCedar_St, nDate_St});
        finishNode(nL_St, new Node[]{n19th_St, n20th_St, n21st_St, n22nd_St, n24th_St, n25th_St, n26th_St, n27th_St, n28th_St, n29th_St, n30th_St});
        finishNode(nK_St, new Node[]{sPark_Blvd, s14th_St, s16th_St, s17th_St, sEleventh_Ave, sTenth_Ave, s7th_Ave, sSixth_Ave, sFifth_Ave, sFourth_Ave});
        finishNode(sK_St, new Node[]{n19th_St, n20th_St, n21st_St, n22nd_St, n24th_St, n25th_St, n26th_St, n27th_St, n28th_St, n29th_St, n30th_St});
        finishNode(nJ_St, new Node[]{s7th_Ave, sSixth_Ave, sFifth_Ave, sFourth_Ave});
        finishNode(sJ_St, new Node[]{sPark_Blvd, s14th_St, s16th_St, s17th_St, n19th_St, n20th_St, n21st_St, n22nd_St, n24th_St, n25th_St, n26th_St, n27th_St, sEleventh_Ave, sTenth_Ave, sNinth_Ave, sEighth_Ave});
        finishNode(nIsland_Ave, new Node[]{s7th_Ave, sSixth_Ave, sFifth_Ave, sFourth_Ave, s1st_Ave, sFront_St, sUnion_St});
        finishNode(sIsland_Ave, new Node[]{sPark_Blvd, s14th_St, s16th_St, s17th_St, n19th_St, n20th_St, n21st_St, n22nd_St, n24th_St, n25th_St, n26th_St, n27th_St, n28th_St, n29th_St, sEleventh_Ave, sTenth_Ave, sNinth_Ave, sEighth_Ave});
        finishNode(nMarket_St, new Node[]{s7th_Ave, sSixth_Ave, sFifth_Ave, sFourth_Ave, s1st_Ave, sFront_St, sUnion_St, sState_St});
        finishNode(sMarket_St, new Node[]{sPark_Blvd, s14th_St, s16th_St, s17th_St, n19th_St, n20th_St, n21st_St, n22nd_St, n24th_St, n25th_St, n26th_St, n27th_St, n28th_St, n29th_St, sEleventh_Ave, sTenth_Ave, sNinth_Ave, sEighth_Ave});
        finishNode(nG_St, new Node[]{s7th_Ave, sSixth_Ave, sFifth_Ave, sFourth_Ave, s1st_Ave, sFront_St, sUnion_St, sState_St, sKettner_St, sPacific_Hwy});
        finishNode(sG_St, new Node[]{sPark_Blvd, s14th_St, s16th_St, s17th_St, n19th_St, n20th_St, n21st_St, n22nd_St, n24th_St, n25th_St, n26th_St, n27th_St, n28th_St, n29th_St, sEleventh_Ave, sTenth_Ave, sNinth_Ave, sEighth_Ave});
        finishNode(nF_St, new Node[]{s7th_Ave, sSixth_Ave, sFifth_Ave, sFourth_Ave});
        finishNode(sF_St, new Node[]{sPark_Blvd, s14th_St, s16th_St, s17th_St, sEleventh_Ave, sTenth_Ave, sNinth_Ave, sEighth_Ave});
        finishNode(nE_St, new Node[]{s7th_Ave, sSixth_Ave, sFifth_Ave, sFourth_Ave});
        finishNode(sE_St, new Node[]{sPark_Blvd, s14th_St, s16th_St, s17th_St, sEleventh_Ave, sTenth_Ave, sNinth_Ave, sEighth_Ave});
        finishNode(nBroadway, new Node[]{n7th_Ave, nSixth_Ave, nFifth_Ave, nFourth_Ave, n3rd_Ave, n2nd_Ave, n1st_Ave, nFront_St, nUnion_St, nState_St, nKettner_St, nPacific_Hwy, nIndia_St, nColumbia_St});
        finishNode(sBroadway, new Node[]{nPark_Blvd, n14th_St, n16th_St, n17th_St, nEleventh_Ave, nTenth_Ave, nNinth_Ave, nEighth_Ave});
        finishNode(nC_St, new Node[]{n7th_Ave, nSixth_Ave, nFifth_Ave, nFourth_Ave, n3rd_Ave, n2nd_Ave, n1st_Ave, nFront_St, nUnion_St, nState_St, nIndia_St, nColumbia_St});
        finishNode(sC_St, new Node[]{nPark_Blvd, n14th_St, n16th_St, n17th_St, nEleventh_Ave, nTenth_Ave, nNinth_Ave, nEighth_Ave});
        finishNode(nB_St, new Node[]{n7th_Ave, nSixth_Ave, nFifth_Ave, nFourth_Ave, n3rd_Ave});
        finishNode(sB_St, new Node[]{nPark_Blvd, n16th_St, n17th_St, nEleventh_Ave, nTenth_Ave, nNinth_Ave, nEighth_Ave});
        finishNode(nA_St, new Node[]{n7th_Ave, nSixth_Ave, nFifth_Ave, nFourth_Ave, nFifth_Ave, nFourth_Ave, n3rd_Ave, n2nd_Ave, n1st_Ave, nFront_St, nUnion_St, nState_St, nKettner_St, nPacific_Hwy, nIndia_St, nColumbia_St});
        finishNode(sA_St, new Node[]{nPark_Blvd, nEleventh_Ave, nTenth_Ave, nNinth_Ave, nEighth_Ave});

        finishNode(nAsh_St, new Node[]{nEleventh_Ave, nTenth_Ave, nNinth_Ave, nEighth_Ave, n7th_Ave, nSixth_Ave, nFifth_Ave, nFourth_Ave, n3rd_Ave, n2nd_Ave, n1st_Ave, nFront_St, nUnion_St, nState_St, nKettner_St, nPacific_Hwy, nIndia_St, nColumbia_St});
        finishNode(nBeech_St, new Node[]{nNinth_Ave, nEighth_Ave, n7th_Ave, nSixth_Ave, nFifth_Ave, nFourth_Ave, n3rd_Ave, n2nd_Ave, n1st_Ave, nFront_St, nUnion_St, nState_St, nKettner_St, nPacific_Hwy, nIndia_St, nColumbia_St});
        finishNode(nCedar_St, new Node[]{nNinth_Ave, nEighth_Ave, n7th_Ave, nSixth_Ave, nFifth_Ave, nFourth_Ave, n3rd_Ave, n2nd_Ave, n1st_Ave, nFront_St, nUnion_St, nState_St, nKettner_St, nPacific_Hwy, nIndia_St, nColumbia_St});
        finishNode(nElm_St, new Node[]{nSixth_Ave, nFifth_Ave, nFourth_Ave, n3rd_Ave, n2nd_Ave, n1st_Ave});
        finishNode(nFir_St, new Node[]{nSixth_Ave, nFifth_Ave, nFourth_Ave, n3rd_Ave, n2nd_Ave, n1st_Ave});
        finishNode(nDate_St, new Node[]{nFront_St, nUnion_St, nState_St, nKettner_St, nIndia_St, nColumbia_St});
        finishNode(n15th_St, new Node[]{nImperial_Ave});


        if (option.equals("Shelter")){
            n15th_St.setisTarget(true);
            nElm_St.setisTarget(true);
            this.targetBuilding=("Shelter");
        }
        else if (option.equals("Hospital")){
            //set the corresponding nodes that refer to the streets that have a hospital
            sFront_St.setisTarget(true);
            n24th_St.setisTarget(true);
            this.targetBuilding=("Hospital");
        }
        else if (option.equals("Food Distribution")){
            //one other thing to find
            n2nd_Ave.setisTarget(true);
            nL_St.setisTarget(true);
            this.targetBuilding=("Food Distribution");
        }

    }

    
    public Node addNode(String street, boolean target){
        Node[] atemp = {};
        Node temp = new Node(street, atemp, target);
        this.adjList.add(temp);
        this.vertices++;
        return temp;
    }

    public void finishNode(Node temp, Node[] neighbors){
        Node[] atemp = neighbors;
        //System.out.println(neighbors.length);
        temp.setListNeighbors(atemp);
        //System.out.println(temp.listNeighbors.length);
    }
    
    
    // Function to perform Breadth First Search on a graph
    // represented using adjacency list
    String bfs(String startNode)
    {
        ArrayList<Node> explored = new ArrayList<>();
        ArrayList<Node> frontier = new ArrayList<>();
        String answer = "";
        //ArrayList<Node> unexplored = new ArrayList<>();
        for (int i = 0; i < this.adjList.size(); i++)
        {
            if (this.adjList.get(i).street.equals(startNode))
            {
                frontier.add(this.adjList.get(i));
            }
            /* 
            else{
                unexplored.add(this.adjList.get(i));
            }
            */
        }
        
        Node temp;
        
        while (!frontier.isEmpty())
        {
            
            temp = frontier.remove(0);
            //System.out.println(temp.street);
            //temp.printNeighbors();
            
            if (temp.isTarget == true)
            {
                
                if (temp.next == null)
                {
                    answer = ("The Street You Are On Contains A " + this.targetBuilding + ".");
                    return answer;
                }
                else{
                    ArrayList<Node> route = new ArrayList<>();
                    route.add(temp);
                    route.add(temp.next);
                    Node temp2 = temp.next;
                    

                    while (temp2.next != null){
                        route.add(temp2.next);
                        temp2 = temp2.next;
                    }
                    ArrayList<Node> revArrayList = new ArrayList<Node>();
                    for (int i = route.size() - 1; i >= 0; i--) {
 
                        // Append the elements in reverse order
                        revArrayList.add(route.get(i));
                    }
                    answer += ("Start from " + revArrayList.get(0).street + ".\n");
                    
                    for (int i = 1; i < revArrayList.size(); i++){
                        answer += ("Go to " + revArrayList.get(i).street + ".\n");
                        
                    }
                    answer += (revArrayList.get(revArrayList.size()-1).street + " Contains A " + this.targetBuilding + ".");
                    return answer;

                }
            }
            
            for (int i = 0; i < temp.listNeighbors.length; i++)
            {
                if ((!explored.contains(temp.listNeighbors[i])) && (!frontier.contains(temp.listNeighbors[i]))){
                    temp.listNeighbors[i].next = temp;
                    frontier.add(temp.listNeighbors[i]);
                    //unexplored.remove(temp.listNeighbors[i]);
                }
            }
            
            //frontier.remove(temp);
            explored.add(temp);
            
        }
        return "Something went Wrong...";
    }
    
    
}
