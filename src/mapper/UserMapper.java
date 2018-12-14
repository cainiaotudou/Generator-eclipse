package mapper;

import po.User;
import po.UserKey;
import po.UserWithBLOBs;

public interface UserMapper {
    int insert(User record);

	int insertSelective(User record);

	int deleteByPrimaryKey(UserKey key);

    int insert(UserWithBLOBs record);

    int insertSelective(UserWithBLOBs record);

    UserWithBLOBs selectByPrimaryKey(UserKey key);

    int updateByPrimaryKeySelective(UserWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UserWithBLOBs record);

    int updateByPrimaryKey(User record);
}