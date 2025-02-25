fun GetMST(graph: Graph): List<Edge> {
    val edges = graph.GetEdges().sortedBy { it.weight }
    val parent = mutableMapOf<String, String>()
    val rank = mutableMapOf<String, Int>()

    graph.GetVertices().forEach { vertex ->
        parent[vertex] = vertex
        rank[vertex] = 0 }

    fun find(vertex: String): String {
        if (parent[vertex] != vertex) {
            parent[vertex] = find(parent[vertex]!!)}
        return parent[vertex]!!}

    fun union(v1: String, v2: String) {
        val root1 = find(v1)
        val root2 = find(v2)
        if (root1 != root2) {
            if (rank[root1]!! > rank[root2]!!) {
                parent[root2] = root1 }
            else if (rank[root1]!! < rank[root2]!!) {
                parent[root1] = root2 }
            else {
                parent[root2] = root1
                rank[root1] = rank[root1]!! + 1}}}

    val mst = mutableListOf<Edge>()
    for (edge in edges) {
        if (find(edge.from) != find(edge.to)) {
            mst.add(edge)
            union(edge.from, edge.to) } }
    return mst }
//using kruskal to get MST of the graph

//////////////////////////////////////////////////////////////////////
