package leecode;

import java.util.LinkedList;
import java.util.Queue;

//void BFS()
//        {
//            定义队列;
//            定义备忘录，用于记录已经访问的位置；
//
//            判断边界条件，是否能直接返回结果的。
//
//            将起始位置加入到队列中，同时更新备忘录。
//
//            while (队列不为空) {
//                获取当前队列中的元素个数。
//                for (元素个数) {
//                    取出一个位置节点。
//                    判断是否到达终点位置。
//                    获取它对应的下一个所有的节点。
//                    条件判断，过滤掉不符合条件的位置。
//                    新位置重新加入队列。
//                }
//            }
//
//        }


public class LC1091 {
    private static Point[] dnext={new Point(0,1),new Point(0,-1),
            new Point(1,-1),new Point(1,0),new Point(1,1),
            new Point(-1,-1),new Point(-1,0),new Point(-1,1),};

    private int row;
    private int col;

    public int shortestPathBinaryMatrix(int[][] grid) {
        row=grid.length;
        col=grid[0].length;
        if(row<=1||col<=1) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if(grid[i][j]!=0)
                        return -1;
                }
            }
            return row+col-1;
        }
        if(grid[0][0]==1||grid[row-1][col-1]==1)
            return -1;
        Queue<Point> queue=new LinkedList<Point>();
        queue.add(new Point(0,0));
        grid[0][0]=1;
        while(!queue.isEmpty()&&grid[row-1][col-1]==0){
            Point curr=queue.remove();
            int currlenth=grid[curr.x][curr.y];

            for(Point pointAdd:dnext){
                int nextX=curr.x+pointAdd.x;
                int nextY=curr.y+pointAdd.y;
                if(isInGridRange(nextX,nextY)&&grid[nextX][nextY]==0){
                    grid[nextX][nextY]=currlenth+1;
                    queue.add(new Point(nextX,nextY));
                }
            }
        }
        if(grid[row-1][col-1]==0)
            return -1;
        else
            return  grid[row-1][col-1];


    }

    private boolean isInGridRange(int x,int y){
        if(x>=0&&y>=0&&x<row&&y<col){
            return true;
        }else
            return false;
    }


}

class Point{
    int x;
    int y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
}
