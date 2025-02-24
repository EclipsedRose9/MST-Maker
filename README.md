# MST-Maker
This project uses MST and Kruskal's algorithm to link nodes and find a minimum distant, this code also includes user input for differnt data sets and is deign in a modular way for multiple different uses


Main
This part of the code is designed to call the functions for my specfic needs, in this case it can be used as an example usage, its resoability is getting user input of data files,calling the functions proprtly and of course the final output

Graph
Grapgh is respobale for creating the graph, defingin and saving all edges and vertices for the MST function to use

MST
MST sorts all edges by weight and uses a union-find to avoid repeating connections it uses iteratation through the sorted edges, adding them if they connect two not alreaydy connectd components, until the MST is formed
