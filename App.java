import com.dao.PersonDao;
import com.daoimpl.MovieDaoImpl;
import com.daoimpl.PersonDaoImpl;
import com.entities.Movie;
import com.entities.Person;
import com.util.ConnectionConfiguration;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class App {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;


        try {
            connection = ConnectionConfiguration.getConnection();
            if (connection != null) {
                System.out.println("Connection establised");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
            PersonDaoImpl user = new PersonDaoImpl();
            //user.createPersonTable();
           // Person person1=new Person("Liviu", "Rebreanu","liviu.rebrenu","123456");
            //user.insert(person1);
            //Person person2=new Person("Jon", "Snow", "jon.snow","12345");
            //user.insert(person2);
        //  Person person3 = new Person("Antonio","Sboiu","antonio.sboiu","parola123");
         // person3.addPersonToDatabase();
            //System.out.println(person.getId()+","+person.getFirst_name()+","+person.getLast_name());

       /* List<Person> persons=user.selectall();
        for(Person person:persons){
            System.out.println(person.getId()+", "+person.getFirst_name()+", "+person.getLast_name());
        }*/
/*
            MovieDaoImpl film = new MovieDaoImpl();
            film.createMovieTable();
            Movie movie1 = new Movie("Titanic", "126 min", "drama", "https://pmcvariety.files.wordpress.com/2017/04/titanic.jpg?w=1000&h=563&crop=1", "12/9/2019", "12:00:00");
            film.insertMovie(movie1);

*/
        }
    }
}

