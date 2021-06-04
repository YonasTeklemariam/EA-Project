package Service;

import Domain.Timeslot;
import Repository.TimeslotRepo;
import Service.interfaces.TimeslotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimeslotServiceImpl implements TimeslotService {
    @Autowired
    private TimeslotRepo timeslotRepo;


    @Override
    public void saveTimeSlot(Timeslot timeslot) {
        if(null != timeslot){
            if(!timeslotRepo.existsTimeslotByTitle(timeslot.getTitle())){
                timeslotRepo.save(timeslot);
            }
        }
    }
}
