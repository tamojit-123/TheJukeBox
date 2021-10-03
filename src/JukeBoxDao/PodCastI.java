package JukeBoxDao;

import exception.PodCastNotFoundException;
import model.PodCast;

import java.util.Date;
import java.util.List;

public interface PodCastI {

    public List<PodCast> searchByPodCastName(List<PodCast> podCastList, String podCastName);

    public List<PodCast> searchByHost(List<PodCast> podCastList, String podCastHost);

    public List<PodCast> searchByPublishedDate(List<PodCast> podCastList, Date publishedDate);
}
