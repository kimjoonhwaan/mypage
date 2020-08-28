package skcc;

import skcc.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class ViewViewHandler {


    @Autowired
    private ViewRepository viewRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenRequested_then_CREATE_1 (@Payload Requested requested) {
        try {
            if (requested.isMe()) {
                // view 객체 생성
                View view = new View();
                // view 객체에 이벤트의 Value 를 set 함
                view.setId(requested.getCheckupId());
                // view 레파지 토리에 save
                viewRepository.save(view);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whenScreeningChanged_then_UPDATE_1(@Payload ScreeningChanged screeningChanged) {
        try {
            if (screeningChanged.isMe()) {
                // view 객체 조회
                Optional<View> viewOptional = viewRepository.findById(screeningChanged.getCheckupId());
                if( viewOptional.isPresent()) {
                    View view = viewOptional.get();
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    view.setStatus(screeningChanged.getStatus());
                    // view 레파지 토리에 save
                    viewRepository.save(view);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenReservationRegistered_then_UPDATE_2(@Payload ReservationRegistered reservationRegistered) {
        try {
            if (reservationRegistered.isMe()) {
                // view 객체 조회
                Optional<View> viewOptional = viewRepository.findById(reservationRegistered.getResvId());
                if( viewOptional.isPresent()) {
                    View view = viewOptional.get();
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    // view 레파지 토리에 save
                    viewRepository.save(view);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}