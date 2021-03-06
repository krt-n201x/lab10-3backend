package se331.lab.rest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import se331.lab.rest.entity.Bid;
import se331.lab.rest.repository.BidRepository;

import java.util.Optional;

@Repository
public class BidDaoImpl implements BidDao{
    @Autowired
    BidRepository bidRepository;


    @Override
    public Page<Bid> getBids(Pageable pageRequest) {
        return bidRepository.findAll(pageRequest);
    }

    @Override
    public Optional<Bid> findById(Long id) {
        return bidRepository.findById(id);
    }
}
