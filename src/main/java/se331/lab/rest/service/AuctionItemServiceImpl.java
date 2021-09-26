package se331.lab.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import se331.lab.rest.dao.AuctionDao;
import se331.lab.rest.dao.BidDao;
import se331.lab.rest.entity.AuctionItem;
import se331.lab.rest.entity.Bid;

import javax.transaction.Transactional;

@Service
public class AuctionItemServiceImpl implements AuctionItemService {
    @Autowired
    AuctionDao auctionDao;
    @Override
    public Integer getAuctionItemSize() {
        return auctionDao.getAuctionItemSize();
    }

    @Override
    public Page<AuctionItem> getAuctionItems(Integer pageSize, Integer page) {
        return auctionDao.getAuctionItems(pageSize, page);
    }

    @Override
    public AuctionItem getAuctionItem(Long id) {
        return auctionDao.getAuctionItem(id);
    }

    @Override
    @Transactional
    public AuctionItem save(AuctionItem auctionItem) {
        return auctionDao.save(auctionItem);
    }

    @Override
    public Page<AuctionItem> getAuctionItems(String title, Pageable page) {
        return auctionDao.getAuctionItem(title, page);
    }
}
