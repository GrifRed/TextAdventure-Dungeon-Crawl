import java.util.ArrayList;

public class Room
	{
		private int x;
		private int y;
		static String roomType;
		private String[] doors;
		private ArrayList objects;
		static String description;
		static boolean isVisited = false;

		public Room(int x_, int y_, String rT, String[] ds, ArrayList ob, String de)
			{
				x = x_;
				y = y_;
				roomType = rT;
				doors = ds;
				objects = ob;
				description = de;

			}

		
		public int getX()
			{
				return x;
			}

		public void setX(int x)
			{
				this.x = x;
			}

		public int getY()
			{
				return y;
			}

		public void setY(int y)
			{
				this.y = y;
			}

		public String getRoomType()
			{
				return roomType;
			}

		public void setRoomType(String roomType)
			{
				this.roomType = roomType;
			}

		public String[] getDoors()
			{
				return doors;
			}

		public void setDoors(String[] doors)
			{
				this.doors = doors;
			}

		public ArrayList getObjects()
			{
				return objects;
			}

		public void setObjects(ArrayList objects)
			{
				this.objects = objects;
			}

		public String getDescription()
			{
				return description;

			}

		public void setDescription(String description)
			{
				this.description = description;
			}

		public boolean isVisited()
			{
				return isVisited;
			}

		public void setVisited(boolean isVisited)
			{
				this.isVisited = isVisited;
			}

		
		
		
		
		
		public static void printDescription(){
				if (isVisited){
					System.out.println("You are back in the " + roomType + "room.");
				} else {
					System.out.println(description);
				}
		}

		public static int countClosedDoors(String[] doors)
			{
				int closedDoors = 0;
				for (String d : doors) {
					if (d == null) {
						closedDoors++;
					}
				}
				return closedDoors;

			}
		
		

	}
