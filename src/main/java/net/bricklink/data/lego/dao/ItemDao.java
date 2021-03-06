package net.bricklink.data.lego.dao;

import lombok.RequiredArgsConstructor;
import net.bricklink.data.lego.dto.BricklinkItem;
import net.bricklink.data.lego.dto.Item;
import net.bricklink.data.lego.ibatis.mapper.ItemMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ItemDao {
    private final ItemMapper itemMapper;

    public List<Item> getAll() {
        return itemMapper.getAll();
    }

    public List<Item> getAllWithNoBricklinkItem() {
        return itemMapper.getAllWithNoBricklinkItem();
    }

    public void insertItem(Item item) {
        itemMapper.insertItem(item);
    }

    public Item findItemById(int itemId) {
        return itemMapper.findItemById(itemId);
    }

    public List<Item> findItemByNumber(String itemNumber) {
        return itemMapper.findItemByNumber(itemNumber);
    }

    public void insertBricklinkItem(BricklinkItem bricklinkItem) {
        itemMapper.insertBricklinkItem(bricklinkItem);
    }

    public void updateItem(Item item) {
        itemMapper.updateItem(item);
    }
}
