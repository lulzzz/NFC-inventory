package com.kevin.rfidmanager.database;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import java.util.Map;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig imagesPathDaoConfig;
    private final DaoConfig itemsDaoConfig;
    private final DaoConfig keyDescriptionDaoConfig;
    private final DaoConfig usersDaoConfig;
    private final DaoConfig saleInfoDaoConfig;

    private final ImagesPathDao imagesPathDao;
    private final ItemsDao itemsDao;
    private final KeyDescriptionDao keyDescriptionDao;
    private final UsersDao usersDao;
    private final SaleInfoDao saleInfoDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        imagesPathDaoConfig = daoConfigMap.get(ImagesPathDao.class).clone();
        imagesPathDaoConfig.initIdentityScope(type);

        itemsDaoConfig = daoConfigMap.get(ItemsDao.class).clone();
        itemsDaoConfig.initIdentityScope(type);

        keyDescriptionDaoConfig = daoConfigMap.get(KeyDescriptionDao.class).clone();
        keyDescriptionDaoConfig.initIdentityScope(type);

        usersDaoConfig = daoConfigMap.get(UsersDao.class).clone();
        usersDaoConfig.initIdentityScope(type);

        saleInfoDaoConfig = daoConfigMap.get(SaleInfoDao.class).clone();
        saleInfoDaoConfig.initIdentityScope(type);

        imagesPathDao = new ImagesPathDao(imagesPathDaoConfig, this);
        itemsDao = new ItemsDao(itemsDaoConfig, this);
        keyDescriptionDao = new KeyDescriptionDao(keyDescriptionDaoConfig, this);
        usersDao = new UsersDao(usersDaoConfig, this);
        saleInfoDao = new SaleInfoDao(saleInfoDaoConfig, this);

        registerDao(ImagesPath.class, imagesPathDao);
        registerDao(Items.class, itemsDao);
        registerDao(KeyDescription.class, keyDescriptionDao);
        registerDao(Users.class, usersDao);
        registerDao(SaleInfo.class, saleInfoDao);
    }
    
    public void clear() {
        imagesPathDaoConfig.clearIdentityScope();
        itemsDaoConfig.clearIdentityScope();
        keyDescriptionDaoConfig.clearIdentityScope();
        usersDaoConfig.clearIdentityScope();
        saleInfoDaoConfig.clearIdentityScope();
    }

    public ImagesPathDao getImagesPathDao() {
        return imagesPathDao;
    }

    public ItemsDao getItemsDao() {
        return itemsDao;
    }

    public KeyDescriptionDao getKeyDescriptionDao() {
        return keyDescriptionDao;
    }

    public UsersDao getUsersDao() {
        return usersDao;
    }

    public SaleInfoDao getSaleInfoDao() {
        return saleInfoDao;
    }

}
