import java.io.File //allows code to read files
import java.util.*


fun SaveFile(filename: String): Graph {
    val graph = Graph()
    File(filename).forEachLine { line ->
        val parts = line.split(", ")
        if (parts.size == 3) {
            val from = parts[0]
            val to = parts[1]
            val weight = parts[2].toInt()
            graph.AddEdge(from, to, weight)}}
    return graph}
//reads the file and adds edges to the graph

/////////////////////////////////////////////////////////////////////////

fun main() {
    print("Enter filename: ")
    val filename = readLine()
    val graph = SaveFile(filename.toString())
    val mst = GetMST(graph)
    var Total = 0
    println("MST of European Cities:")
    for (edge in mst) {
        println("${edge.from} -> ${edge.to} : ${edge.weight}")
        Total += edge.weight }
    println("Total weight of MST: $Total") }
//runs the functions as needed and outputs the total