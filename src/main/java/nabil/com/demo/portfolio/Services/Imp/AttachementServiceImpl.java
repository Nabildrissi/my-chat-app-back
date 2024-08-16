package nabil.com.demo.portfolio.Services.Imp;

import lombok.RequiredArgsConstructor;
import nabil.com.demo.portfolio.DTO.AttachementDto;
import nabil.com.demo.portfolio.Entity.Attachement;
import nabil.com.demo.portfolio.Mappers.AttachementMapper;
import nabil.com.demo.portfolio.Repository.AttachementRepository;
import nabil.com.demo.portfolio.Services.AttachementService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AttachementServiceImpl implements AttachementService {

    private  final AttachementMapper attachementMapper;
    private final AttachementRepository attachementRepository;
    @Override
    public AttachementDto sendAttachement(AttachementDto attachementDto) {
        Attachement attachement = attachementMapper.toEntity(attachementDto);
        attachement = attachementRepository.save(attachement);
        return attachementMapper.toDto(attachement);
    }
}
