

package citbyui.cit260.zombieFinal.model;

import java.io.Serializable;


public class Map implements Serializable {
    private boolean visited;
    private long rowCount;
    private long columnCount;
private Location[][] locations;
private int noOfRows;
private int noOfColumns;

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public long getRowCount() {
        return rowCount;
    }

    public Map(boolean visited) {
        this.visited = visited;
    }

    public void setRowCount(long rowCount) {
        this.rowCount = rowCount;
    }

    public long getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(long columnCount) {
        this.columnCount = columnCount;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public int getNoOfRows() {
        return noOfRows;
    }

    public void setNoOfRows(int noOfRows) {
        this.noOfRows = noOfRows;
    }

    public int getNoOfColumns() {
        return noOfColumns;
    }

    public void setNoOfColumns(int noOfColumns) {
        this.noOfColumns = noOfColumns;
    }

    public Map() {
        
    }

    public Map(int noOfRows, int noOfColumns){
        
        if(noOfRows < 1 || noOfColumns <1){
            
                    System.out.println("\n The number of rows and columns must be > 0");
return;
       
    }
        
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        this.locations = new Location[noOfRows][noOfColumns];
        
        for(int row = 0; row <noOfRows; row++ ){
            
            for(int column = 0; column <noOfColumns; column++ ){
                
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                locations [row][column] = location;
            }

        
        }
    }
    
                


        


    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (this.rowCount ^ (this.rowCount >>> 32));
        hash = 37 * hash + (int) (this.columnCount ^ (this.columnCount >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        return true;
    }
    
    
    
}
