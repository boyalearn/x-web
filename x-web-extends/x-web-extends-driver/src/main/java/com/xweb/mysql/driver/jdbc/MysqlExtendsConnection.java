package com.xweb.mysql.driver.jdbc;

import com.mysql.cj.NativeSession;
import com.mysql.cj.ServerVersion;
import com.mysql.cj.conf.HostInfo;
import com.mysql.cj.exceptions.ExceptionInterceptor;
import com.mysql.cj.interceptors.QueryInterceptor;
import com.mysql.cj.jdbc.ClientInfoProvider;
import com.mysql.cj.jdbc.ConnectionImpl;
import com.mysql.cj.jdbc.JdbcConnection;
import com.mysql.cj.jdbc.JdbcPreparedStatement;
import com.mysql.cj.jdbc.JdbcPropertySet;
import com.mysql.cj.jdbc.JdbcStatement;
import com.mysql.cj.jdbc.result.CachedResultSetMetaData;
import com.mysql.cj.jdbc.result.ResultSetInternalMethods;
import com.mysql.cj.protocol.ServerSessionStateController;
import com.xweb.sql.mysql.MysqlUtils;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class MysqlExtendsConnection extends ConnectionImpl {

    private ConnectionImpl connection;

    public MysqlExtendsConnection(ConnectionImpl connection) {
        this.connection = connection;
    }

    @Override
    public String getHost() {
        return this.connection.getHost();
    }

    @Override
    public boolean isProxySet() {
        return this.connection.isProxySet();
    }

    @Override
    public void setProxy(JdbcConnection proxy) {
        this.connection.setProxy(proxy);
    }

    @Override
    public JdbcConnection getMultiHostSafeProxy() {
        return this.connection.getMultiHostSafeProxy();
    }

    @Override
    public JdbcConnection getMultiHostParentProxy() {
        return this.connection.getMultiHostParentProxy();
    }

    @Override
    public JdbcConnection getActiveMySQLConnection() {
        return this.connection.getActiveMySQLConnection();
    }

    @Override
    public Object getConnectionMutex() {
        return this.connection.getConnectionMutex();
    }

    protected MysqlExtendsConnection() {
        super();
    }

    public MysqlExtendsConnection(HostInfo hostInfo) throws SQLException {
        super(hostInfo);
    }

    @Override
    public JdbcPropertySet getPropertySet() {
        return this.connection.getPropertySet();
    }

    @Override
    public void unSafeQueryInterceptors() throws SQLException {
        this.connection.unSafeQueryInterceptors();
    }

    @Override
    public void initializeSafeQueryInterceptors() throws SQLException {
        this.connection.initializeSafeQueryInterceptors();
    }

    @Override
    public List<QueryInterceptor> getQueryInterceptorsInstances() {
        return this.connection.getQueryInterceptorsInstances();
    }

    @Override
    public void changeUser(String userName, String newPassword) throws SQLException {
        this.connection.changeUser(userName, newPassword);
    }

    @Override
    public void checkClosed() {
        this.connection.checkClosed();
    }

    @Override
    public void throwConnectionClosedException() throws SQLException {
        this.connection.throwConnectionClosedException();
    }

    @Override
    public void abortInternal() throws SQLException {
        this.connection.abortInternal();
    }

    @Override
    public void cleanup(Throwable whyCleanedUp) {
        this.connection.cleanup(whyCleanedUp);
    }

    @Override
    public void clearHasTriedMaster() {
        this.connection.clearHasTriedMaster();
    }

    @Override
    public void clearWarnings() throws SQLException {
        this.connection.clearWarnings();
    }

    @Override
    public PreparedStatement clientPrepareStatement(String sql) throws SQLException {
        return this.connection.clientPrepareStatement(sql);
    }

    @Override
    public PreparedStatement clientPrepareStatement(String sql, int autoGenKeyIndex) throws SQLException {
        return this.connection.clientPrepareStatement(sql, autoGenKeyIndex);
    }

    @Override
    public PreparedStatement clientPrepareStatement(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        return this.connection.clientPrepareStatement(sql, resultSetType, resultSetConcurrency);
    }

    @Override
    public PreparedStatement clientPrepareStatement(String sql, int resultSetType, int resultSetConcurrency, boolean processEscapeCodesIfNeeded) throws SQLException {
        return this.connection.clientPrepareStatement(sql, resultSetType, resultSetConcurrency, processEscapeCodesIfNeeded);
    }

    @Override
    public PreparedStatement clientPrepareStatement(String sql, int[] autoGenKeyIndexes) throws SQLException {
        return this.connection.clientPrepareStatement(sql, autoGenKeyIndexes);
    }

    @Override
    public PreparedStatement clientPrepareStatement(String sql, String[] autoGenKeyColNames) throws SQLException {
        return this.connection.clientPrepareStatement(sql, autoGenKeyColNames);
    }

    @Override
    public PreparedStatement clientPrepareStatement(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return this.connection.clientPrepareStatement(sql, resultSetType, resultSetConcurrency, resultSetHoldability);
    }

    @Override
    public void close() throws SQLException {
        this.connection.close();
    }

    @Override
    public void normalClose() {
        this.connection.normalClose();
    }

    @Override
    public void commit() throws SQLException {
        this.connection.commit();
    }

    @Override
    public void createNewIO(boolean isForReconnect) {
        this.connection.createNewIO(isForReconnect);
    }

    @Override
    public Statement createStatement() throws SQLException {
        return this.connection.createStatement();
    }

    @Override
    public Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException {
        return this.connection.createStatement(resultSetType, resultSetConcurrency);
    }

    @Override
    public Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return this.connection.createStatement(resultSetType, resultSetConcurrency, resultSetHoldability);
    }

    @Override
    public int getActiveStatementCount() {
        return this.connection.getActiveStatementCount();
    }

    @Override
    public boolean getAutoCommit() throws SQLException {
        return this.connection.getAutoCommit();
    }

    @Override
    public String getCatalog() throws SQLException {
        return this.connection.getCatalog();
    }

    @Override
    public String getCharacterSetMetadata() {
        return this.connection.getCharacterSetMetadata();
    }

    @Override
    public int getHoldability() throws SQLException {
        return this.connection.getHoldability();
    }

    @Override
    public long getId() {
        return this.connection.getId();
    }

    @Override
    public long getIdleFor() {
        return this.connection.getIdleFor();
    }

    @Override
    public DatabaseMetaData getMetaData() throws SQLException {
        return this.connection.getMetaData();
    }

    @Override
    public Statement getMetadataSafeStatement() throws SQLException {
        return this.connection.getMetadataSafeStatement();
    }

    @Override
    public Statement getMetadataSafeStatement(int maxRows) throws SQLException {
        return this.connection.getMetadataSafeStatement(maxRows);
    }

    @Override
    public ServerVersion getServerVersion() {
        return this.connection.getServerVersion();
    }

    @Override
    public int getTransactionIsolation() throws SQLException {
        return this.connection.getTransactionIsolation();
    }

    @Override
    public Map<String, Class<?>> getTypeMap() throws SQLException {
        return this.connection.getTypeMap();
    }

    @Override
    public String getURL() {
        return this.connection.getURL();
    }

    @Override
    public String getUser() {
        return this.connection.getUser();
    }

    @Override
    public SQLWarning getWarnings() throws SQLException {
        return this.connection.getWarnings();
    }

    @Override
    public boolean hasSameProperties(JdbcConnection c) {
        return this.connection.hasSameProperties(c);
    }

    @Override
    public Properties getProperties() {
        return this.connection.getProperties();
    }

    @Override
    public boolean hasTriedMaster() {
        return this.connection.hasTriedMaster();
    }

    @Override
    public boolean isClosed() {
        return this.connection.isClosed();
    }

    @Override
    public boolean isInGlobalTx() {
        return this.connection.isInGlobalTx();
    }

    @Override
    public boolean isSourceConnection() {
        return this.connection.isSourceConnection();
    }

    @Override
    public boolean isReadOnly() throws SQLException {
        return this.connection.isReadOnly();
    }

    @Override
    public boolean isReadOnly(boolean useSessionStatus) throws SQLException {
        return this.connection.isReadOnly(useSessionStatus);
    }

    @Override
    public boolean isSameResource(JdbcConnection otherConnection) {
        return this.connection.isSameResource(otherConnection);
    }

    @Override
    public int getAutoIncrementIncrement() {
        return this.connection.getAutoIncrementIncrement();
    }

    @Override
    public boolean lowerCaseTableNames() {
        return this.connection.lowerCaseTableNames();
    }

    @Override
    public String nativeSQL(String sql) throws SQLException {
        return this.connection.nativeSQL(sql);
    }

    @Override
    public void ping() throws SQLException {
        this.connection.ping();
    }

    @Override
    public void pingInternal(boolean checkForClosedConnection, int timeoutMillis) throws SQLException {
        this.connection.pingInternal(checkForClosedConnection, timeoutMillis);
    }

    @Override
    public CallableStatement prepareCall(String sql) throws SQLException {
        return this.connection.prepareCall(sql);
    }

    @Override
    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        return this.connection.prepareCall(sql, resultSetType, resultSetConcurrency);
    }

    @Override
    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return this.connection.prepareCall(sql, resultSetType, resultSetConcurrency, resultSetHoldability);
    }

    @Override
    public PreparedStatement prepareStatement(String sql) throws SQLException {
        if (sql.toUpperCase(Locale.ROOT).startsWith("SELECT")) {
            System.out.println("s" + sql);
            final String convertSql = MysqlUtils.convert(sql);
            System.out.println("d" + convertSql);
            return this.connection.prepareStatement(convertSql);
        }
        return this.connection.prepareStatement(sql);
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int autoGenKeyIndex) throws SQLException {
        return this.connection.prepareStatement(sql, autoGenKeyIndex);
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        return this.connection.prepareStatement(sql, resultSetType, resultSetConcurrency);
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return this.connection.prepareStatement(sql, resultSetType, resultSetConcurrency, resultSetHoldability);
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int[] autoGenKeyIndexes) throws SQLException {
        return this.connection.prepareStatement(sql, autoGenKeyIndexes);
    }

    @Override
    public PreparedStatement prepareStatement(String sql, String[] autoGenKeyColNames) throws SQLException {
        return this.connection.prepareStatement(sql, autoGenKeyColNames);
    }

    @Override
    public void realClose(boolean calledExplicitly, boolean issueRollback, boolean skipLocalTeardown, Throwable reason) throws SQLException {
        this.connection.realClose(calledExplicitly, issueRollback, skipLocalTeardown, reason);
    }

    @Override
    public void recachePreparedStatement(JdbcPreparedStatement pstmt) throws SQLException {
        this.connection.recachePreparedStatement(pstmt);
    }

    @Override
    public void decachePreparedStatement(JdbcPreparedStatement pstmt) throws SQLException {
        this.connection.decachePreparedStatement(pstmt);
    }

    @Override
    public void registerStatement(JdbcStatement stmt) {
        this.connection.registerStatement(stmt);
    }

    @Override
    public void releaseSavepoint(Savepoint arg0) throws SQLException {
        this.connection.releaseSavepoint(arg0);
    }

    @Override
    public void resetServerState() throws SQLException {
        this.connection.resetServerState();
    }

    @Override
    public void rollback() throws SQLException {
        this.connection.rollback();
    }

    @Override
    public void rollback(Savepoint savepoint) throws SQLException {
        this.connection.rollback(savepoint);
    }

    @Override
    public PreparedStatement serverPrepareStatement(String sql) throws SQLException {
        return this.connection.serverPrepareStatement(sql);
    }

    @Override
    public PreparedStatement serverPrepareStatement(String sql, int autoGenKeyIndex) throws SQLException {
        return this.connection.serverPrepareStatement(sql, autoGenKeyIndex);
    }

    @Override
    public PreparedStatement serverPrepareStatement(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        return this.connection.serverPrepareStatement(sql, resultSetType, resultSetConcurrency);
    }

    @Override
    public PreparedStatement serverPrepareStatement(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return this.connection.serverPrepareStatement(sql, resultSetType, resultSetConcurrency, resultSetHoldability);
    }

    @Override
    public PreparedStatement serverPrepareStatement(String sql, int[] autoGenKeyIndexes) throws SQLException {
        return this.connection.serverPrepareStatement(sql, autoGenKeyIndexes);
    }

    @Override
    public PreparedStatement serverPrepareStatement(String sql, String[] autoGenKeyColNames) throws SQLException {
        return this.connection.serverPrepareStatement(sql, autoGenKeyColNames);
    }

    @Override
    public void setAutoCommit(boolean autoCommitFlag) throws SQLException {
        this.connection.setAutoCommit(autoCommitFlag);
    }

    @Override
    public void setCatalog(String catalog) throws SQLException {
        this.connection.setCatalog(catalog);
    }

    @Override
    public void setDatabase(String db) throws SQLException {
        this.connection.setDatabase(db);
    }

    @Override
    public String getDatabase() throws SQLException {
        return this.connection.getDatabase();
    }

    @Override
    public void setFailedOver(boolean flag) {
        this.connection.setFailedOver(flag);
    }

    @Override
    public void setHoldability(int arg0) throws SQLException {
        this.connection.setHoldability(arg0);
    }

    @Override
    public void setInGlobalTx(boolean flag) {
        this.connection.setInGlobalTx(flag);
    }

    @Override
    public void setReadOnly(boolean readOnlyFlag) throws SQLException {
        this.connection.setReadOnly(readOnlyFlag);
    }

    @Override
    public void setReadOnlyInternal(boolean readOnlyFlag) throws SQLException {
        this.connection.setReadOnlyInternal(readOnlyFlag);
    }

    @Override
    public Savepoint setSavepoint() throws SQLException {
        return this.connection.setSavepoint();
    }

    @Override
    public Savepoint setSavepoint(String name) throws SQLException {
        return this.connection.setSavepoint(name);
    }

    @Override
    public void setTransactionIsolation(int level) throws SQLException {
        this.connection.setTransactionIsolation(level);
    }

    @Override
    public void setTypeMap(Map<String, Class<?>> map) throws SQLException {
        this.connection.setTypeMap(map);
    }

    @Override
    public void shutdownServer() throws SQLException {
        this.connection.shutdownServer();
    }

    @Override
    public void unregisterStatement(JdbcStatement stmt) {
        this.connection.unregisterStatement(stmt);
    }

    @Override
    public boolean versionMeetsMinimum(int major, int minor, int subminor) {
        return this.connection.versionMeetsMinimum(major, minor, subminor);
    }

    @Override
    public CachedResultSetMetaData getCachedMetaData(String sql) {
        return this.connection.getCachedMetaData(sql);
    }

    @Override
    public void initializeResultsMetadataFromCache(String sql, CachedResultSetMetaData cachedMetaData, ResultSetInternalMethods resultSet) throws SQLException {
        this.connection.initializeResultsMetadataFromCache(sql, cachedMetaData, resultSet);
    }

    @Override
    public String getStatementComment() {
        return this.connection.getStatementComment();
    }

    @Override
    public void setStatementComment(String comment) {
        this.connection.setStatementComment(comment);
    }

    @Override
    public void transactionBegun() {
        this.connection.transactionBegun();
    }

    @Override
    public void transactionCompleted() {
        this.connection.transactionCompleted();
    }

    @Override
    public boolean storesLowerCaseTableName() {
        return this.connection.storesLowerCaseTableName();
    }

    @Override
    public ExceptionInterceptor getExceptionInterceptor() {
        return this.connection.getExceptionInterceptor();
    }

    @Override
    public boolean isServerLocal() throws SQLException {
        return this.connection.isServerLocal();
    }

    @Override
    public int getSessionMaxRows() {
        return this.connection.getSessionMaxRows();
    }

    @Override
    public void setSessionMaxRows(int max) throws SQLException {
        this.connection.setSessionMaxRows(max);
    }

    @Override
    public void setSchema(String schema) throws SQLException {
        this.connection.setSchema(schema);
    }

    @Override
    public String getSchema() throws SQLException {
        return this.connection.getSchema();
    }

    @Override
    public void abort(Executor executor) throws SQLException {
        this.connection.abort(executor);
    }

    @Override
    public void setNetworkTimeout(Executor executor, int milliseconds) throws SQLException {
        this.connection.setNetworkTimeout(executor, milliseconds);
    }

    @Override
    public int getNetworkTimeout() throws SQLException {
        return this.connection.getNetworkTimeout();
    }

    @Override
    public Clob createClob() {
        return this.connection.createClob();
    }

    @Override
    public Blob createBlob() {
        return this.connection.createBlob();
    }

    @Override
    public NClob createNClob() {
        return this.connection.createNClob();
    }

    @Override
    public SQLXML createSQLXML() throws SQLException {
        return this.connection.createSQLXML();
    }

    @Override
    public boolean isValid(int timeout) throws SQLException {
        return this.connection.isValid(timeout);
    }

    @Override
    public ClientInfoProvider getClientInfoProviderImpl() throws SQLException {
        return this.connection.getClientInfoProviderImpl();
    }

    @Override
    public void setClientInfo(String name, String value) throws SQLClientInfoException {
        this.connection.setClientInfo(name, value);
    }

    @Override
    public void setClientInfo(Properties properties) throws SQLClientInfoException {
        this.connection.setClientInfo(properties);
    }

    @Override
    public String getClientInfo(String name) throws SQLException {
        return this.connection.getClientInfo(name);
    }

    @Override
    public Properties getClientInfo() throws SQLException {
        return this.connection.getClientInfo();
    }

    @Override
    public Array createArrayOf(String typeName, Object[] elements) throws SQLException {
        return this.connection.createArrayOf(typeName, elements);
    }

    @Override
    public Struct createStruct(String typeName, Object[] attributes) throws SQLException {
        return this.connection.createStruct(typeName, attributes);
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return this.connection.unwrap(iface);
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return this.connection.isWrapperFor(iface);
    }

    @Override
    public NativeSession getSession() {
        return this.connection.getSession();
    }

    @Override
    public String getHostPortPair() {
        return this.connection.getHostPortPair();
    }

    @Override
    public void handleNormalClose() {
        this.connection.handleNormalClose();
    }

    @Override
    public void handleReconnect() {
        this.connection.handleReconnect();
    }

    @Override
    public void handleCleanup(Throwable whyCleanedUp) {
        this.connection.handleCleanup(whyCleanedUp);
    }

    @Override
    public ServerSessionStateController getServerSessionStateController() {
        return this.connection.getServerSessionStateController();
    }

    @Override
    public boolean isMasterConnection() {
        return this.connection.isSourceConnection();
    }

    @Override
    public int hashCode() {
        return this.connection.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.connection.equals(obj);
    }


    @Override
    public String toString() {
        return this.connection.toString();
    }
}
