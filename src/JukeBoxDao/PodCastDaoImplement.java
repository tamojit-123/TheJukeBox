package JukeBoxDao;

import database.DatabaseConnection;
import exception.PodCastNotFoundException;
import model.PodCast;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class PodCastDaoImplement implements PodCastI {

    List<PodCast> podCastList = new LinkedList<>();

    public void display(List<PodCast> podCastList) {

        System.out.format("%-20s %-20s %-20s %-30s %-30s %-30s %-30s\n", "PodCast Id", "PodCast Name", "PodCast Duration", "PodCast Published Date", "PodCast Album Name", "PodCast Host Name", "Genre");
        System.out.println("==========================================================================================================================================================================");
        podCastList.forEach(podcast -> System.out.format("%-20s %-20s %-20s %-30s %-30s %-30s %-30s\n", podcast.getPodCastId(), podcast.getPodCastName(), podcast.getPodCastDuration(), podcast.getPublishedDate(),
                podcast.getPodCastAlbum(), podcast.getPodCastHost(), podcast.getGenre()));
    }

    public List<PodCast> fetchData() {

        try {
            Connection connection = DatabaseConnection.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement("Select * from PodCast");
            ResultSet resultSet = preparedStatement.executeQuery();


            while (resultSet.next()) {

                PodCast podCastData = new PodCast();

                podCastData.setPodCastId(resultSet.getInt(1));
                podCastData.setPodCastName(resultSet.getString(2));
                podCastData.setPodCastDuration(resultSet.getTime(3));
                podCastData.setPublishedDate(resultSet.getDate(4));
                podCastData.setPodCastAlbum(resultSet.getString(5));
                podCastData.setPodCastHost(resultSet.getString(6));
                podCastData.setGenre(resultSet.getString(7));
                podCastList.add(podCastData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return podCastList;

    }

    @Override
    public List<PodCast> searchByPodCastName(List<PodCast> podCastList, String podCastName) {
        return podCastList.stream().filter(p -> p.getPodCastName().equalsIgnoreCase(podCastName)).collect(Collectors.toList());
    }

    @Override
    public List<PodCast> searchByHost(List<PodCast> podCastList, String podCastHost) {
        return podCastList.stream().filter(p -> p.getPodCastHost().equalsIgnoreCase(podCastHost)).collect(Collectors.toList());
    }

    @Override
    public List<PodCast> searchByPublishedDate(List<PodCast> podCastList, java.util.Date publishedDate) {
        return podCastList.stream().filter(p -> p.getPublishedDate().equals(publishedDate)).collect(Collectors.toList());
    }
}