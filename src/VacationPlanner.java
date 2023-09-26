import java.util.Scanner;
public class VacationPlanner {
    public static void response(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Do you want a relaxing vacation or adventurous vacation?");
        String r1 = s.nextLine();
        if (r1.equals("relaxing")) {
            System.out.println("Would you prefer a beach destination or spa retreat?");
            String r2 = s.nextLine();
            if (r2.equals("beach")){
                System.out.println("Then I recommend Cabo");
            } else r2.equals("spa");{
                System.out.println("Then I recommend a luxurious spa resort");
            }
        }else r1.equals("adventurous");{
            System.out.println("Would you prefer a mountain adventure or a city exploration?");
            String r3 = s.nextLine();
            if (r3.equals("mountain"));{
                System.out.println("Then I recommend a hiking trip to Mount Hood");
            }if(r3.equals("city"));{
                System.out.println("Then I recommend a cultural city tour");
            }
        }
    }
    }
