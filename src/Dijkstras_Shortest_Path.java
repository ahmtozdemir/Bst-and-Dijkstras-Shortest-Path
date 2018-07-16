import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class Dijkstras_Shortest_Path {
	
		int i,j,n=0;

	    int[][]array = new int[10][10];  		

	        BufferedReader input = new BufferedReader(new FileReader("input.txt"));
	        
	        String line;

	        while((line = input.readLine()) != null) { //read each line
	    		
	    	    String[]cols = input.split(" "); //split the line on the single space character

	            for (i = 0; i < n; i++){

	                for (j = 0; j < n; j++){

	                    array[i][j] = input.read();

	                }   

	            }
	        }
	    
	        for (i = 0; i < n; i++){

	            for (j = 0; j < n; j++){

	                System.out.print(array[i][j]);

	            }

	        }

	    } 

		
		private int          distances[];

	    private Set<Integer> settled;

	    private Set<Integer> unsettled;

	    private int          number_of_nodes;

	    private int          adjacencyMatrix[][];



	    public Dijkstras_Shortest_Path(int number_of_nodes)

	    {
	    	
	        this.number_of_nodes = number_of_nodes;

	        distances = new int[number_of_nodes + 1];

	        settled = new HashSet<Integer>();

	        unsettled = new HashSet<Integer>();

	        adjacencyMatrix = new int[number_of_nodes + 1][number_of_nodes + 1];

	    }



	    public void dijkstra(int adjacency_matrix[][], int source)

	    {

	        int evaluationNode;

	        for (int i = 1; i <= number_of_nodes; i++)

	            for (int j = 1; j <= number_of_nodes; j++)

	                adjacencyMatrix[i][j] = adjacency_matrix[i][j];



	        for (int i = 1; i <= number_of_nodes; i++)

	        {

	            distances[i] = Integer.MAX_VALUE;

	        }



	        unsettled.add(source);

	        distances[source] = 0;

	        while (!unsettled.isEmpty())

	        {

	            evaluationNode = getNodeWithMinimumDistanceFromUnsettled();

	            unsettled.remove(evaluationNode);

	            settled.add(evaluationNode);

	            evaluateNeighbours(evaluationNode);

	        }

	    }



	    private int getNodeWithMinimumDistanceFromUnsettled()

	    {

	        int min;

	        int node = 0;



	        Iterator<Integer> iterator = unsettled.iterator();

	        node = iterator.next();

	        min = distances[node];

	        for (int i = 1; i <= distances.length; i++)

	        {

	            if (unsettled.contains(i))

	            {

	                if (distances[i] <= min)

	                {

	                    min = distances[i];

	                    node = i;

	                }

	            }

	        }

	        return node;

	    }



	    private void evaluateNeighbours(int evaluationNode)

	    {

	        int edgeDistance = -1;

	        int newDistance = -1;

	        for (int destinationNode = 1; destinationNode <= number_of_nodes; destinationNode++)

	        {

	            if (!settled.contains(destinationNode))

	            {

	                if (adjacencyMatrix[evaluationNode][destinationNode] != Integer.MAX_VALUE)

	                {

	                    edgeDistance = adjacencyMatrix[evaluationNode][destinationNode];

	                    newDistance = distances[evaluationNode] + edgeDistance;

	                    if (newDistance < distances[destinationNode])

	                    {

	                        distances[destinationNode] = newDistance;

	                    }

	                    unsettled.add(destinationNode);

	                }

	            }

	        }

	    }
 
	    public static void main(String[] args)

	    {

	        int adjacency_matrix[][];
	        
	        int source = 0, destination = 0;

	        int number_of_vertices;

	        Scanner scan = new Scanner(System.in);

	        try

	        {
	        
	            number_of_vertices = scan.nextInt();

	            adjacency_matrix = new int[number_of_vertices + 1][number_of_vertices + 1];


	            for (int i = 1; i <= number_of_vertices; i++)

	            {

	                for (int j = 1; j <= number_of_vertices; j++)

	                {

	                    adjacency_matrix[i][j] = scan.nextInt();

	                    if (i == j)

	                    {

	                        adjacency_matrix[i][j] = 0;

	                        continue;

	                    }

	                    if (adjacency_matrix[i][j] == 0)

	                    {

	                        adjacency_matrix[i][j] = Integer.MAX_VALUE;

	                    }

	                }

	            }


	            Dijkstras_Shortest_Path dijkstrasAlgorithm = new Dijkstras_Shortest_Path(number_of_vertices);

	            Bst Psychology = new Bst();
	            
	            Psychology.insertNode();
	            Psychology.findNode();
	    		System.out.println("Inserted."+dijkstrasAlgorithm.distances[0]+"m.");
	         
	            //Initialize
	            
	    		dijkstrasAlgorithm.dijkstra(adjacency_matrix,source);
	    		System.out.println("Initialized."+dijkstrasAlgorithm.distances[0]+"m.");
	    		
	            //List
	    		
	    		Psychology.inOrderTraverse(Psychology.root);
	    		System.out.println(dijkstrasAlgorithm.distances[0]+"m.");
	    		
	    		Bst History = new Bst();
	    		
	    		History.insertNode();
	    		History.findNode();
	    		System.out.println("Inserted."+dijkstrasAlgorithm.distances[0]+"m.");
	    		
	    		//Initialize
	    		
	    		dijkstrasAlgorithm.dijkstra(adjacency_matrix,source);
	    		System.out.println("Initialized."+dijkstrasAlgorithm.distances[0]+"m.");
	    		
	    		//List
	    		
	    		History.inOrderTraverse(History.root);
	    		System.out.println(dijkstrasAlgorithm.distances[0]+"m.");
	    		
	    		Bst Sociology = new Bst();
	    		
	    		Sociology.insertNode();
	    		Sociology.findNode();
	    		System.out.println("Inserted."+dijkstrasAlgorithm.distances[0]+"m.");
	    		
	    		//Initialize
	    		
	    		dijkstrasAlgorithm.dijkstra(adjacency_matrix,source);
	    		System.out.println("Initialized."+dijkstrasAlgorithm.distances[0]+"m.");
	    		
	    		//List
	    		
	    		Sociology.inOrderTraverse(Sociology.root);
	    		System.out.println(dijkstrasAlgorithm.distances[0]+"m.");
	    		
	    		Bst Biology =  new Bst();
	    		
	    		Biology.insertNode();
	    		Biology.findNode();
	    		System.out.println("Inserted."+dijkstrasAlgorithm.distances[0]+"m.");
	    		
	    		//Initialize
	    		
	    		dijkstrasAlgorithm.dijkstra(adjacency_matrix,source);
	    		System.out.println("Initialized."+dijkstrasAlgorithm.distances[0]+"m.");
	    		
	    		//List
	    		
	    		Biology.inOrderTraverse(Biology.root);
	    		System.out.println(dijkstrasAlgorithm.distances[0]+"m.");
	    		
	    		Bst Business = new Bst();
	    		
	    		Business.insertNode();
	    		Business.findNode();
	    		System.out.println("Inserted."+dijkstrasAlgorithm.distances[0]+"m.");
	    		
	    		//Initialize
	    		
	    		dijkstrasAlgorithm.dijkstra(adjacency_matrix,source);
	    		System.out.println("Initialized."+dijkstrasAlgorithm.distances[0]+"m.");
	    		
	    		//List
	    		
	    		Business.inOrderTraverse(Business.root);
	    		System.out.println(dijkstrasAlgorithm.distances[0]+"m.");
	    		
	    		Bst Languages = new Bst();
	    		
	    		Languages.insertNode();
	    		Languages.findNode();
	    		System.out.println("Inserted."+dijkstrasAlgorithm.distances[0]+"m.");
	    		
	    		//Initialize
	    		
	    		dijkstrasAlgorithm.dijkstra(adjacency_matrix,source);
	    		System.out.println("Initialized."+dijkstrasAlgorithm.distances[0]+"m.");
	    		
	    		//List
	    		
	    		Languages.inOrderTraverse(Languages.root);
	    		System.out.println(dijkstrasAlgorithm.distances[0]+"m.");
	    		
	    		Bst Tourism = new Bst();
	    		
	    		Tourism.insertNode();
	    		Tourism.findNode();
	    		System.out.println("Inserted."+dijkstrasAlgorithm.distances[0]+"m.");
	    		
	    		//Initialize
	    		
	    		dijkstrasAlgorithm.dijkstra(adjacency_matrix,source);
	    		System.out.println("Initialized."+dijkstrasAlgorithm.distances[0]+"m.");
	    		
	    		//List
	    		
	    		Tourism.inOrderTraverse(Tourism.root);
	    		System.out.println(dijkstrasAlgorithm.distances[0]+"m.");
	    		
	    		Bst Mathematics = new Bst();
	    		
	    		Mathematics.insertNode();
	    		Mathematics.findNode();
	    		System.out.println("Inserted."+dijkstrasAlgorithm.distances[0]+"m.");
	    		
	    		//Initialize
	    		
	    		dijkstrasAlgorithm.dijkstra(adjacency_matrix,source);
	    		System.out.println("Initialized."+dijkstrasAlgorithm.distances[0]+"m.");
	    		
	    		//List
	    		
	    		Mathematics.inOrderTraverse(Mathematics.root);
	    		System.out.println(dijkstrasAlgorithm.distances[0]+"m.");
	    		
	    		Bst Theology = new Bst();
	    		
	    		Theology.insertNode();
	    		Theology.findNode();
	    		System.out.println("Inserted."+dijkstrasAlgorithm.distances[0]+"m.");
	    		
	    		//Initialize
	    		
	    		dijkstrasAlgorithm.dijkstra(adjacency_matrix,source);
	    		System.out.println("Initialized."+dijkstrasAlgorithm.distances[0]+"m.");
	    		
	    		//List
	    		
	    		Theology.inOrderTraverse(Theology.root);
	    		System.out.println(dijkstrasAlgorithm.distances[0]+"m.");
	    		
	    		
	            for (int i = 1; i <= dijkstrasAlgorithm.distances.length - 1; i++)

	            {

	                if (i == destination) {

	                	
	                	System.out.println(source + " to " + i + " is "+ dijkstrasAlgorithm.distances[i]);
	                }
	            }

	        } catch (InputMismatchException inputMismatch)

	        {

	            System.out.println("Wrong Input Format");

	        }

	        scan.close();

	    }

	}