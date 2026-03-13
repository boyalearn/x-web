package com.xweb.mysql.driver.jdbc;

import com.mysql.cj.CancelQueryTask;
import com.mysql.cj.ClientPreparedQuery;
import com.mysql.cj.MysqlType;
import com.mysql.cj.ParseInfo;
import com.mysql.cj.PingTarget;
import com.mysql.cj.Query;
import com.mysql.cj.QueryAttributesBindings;
import com.mysql.cj.QueryBindings;
import com.mysql.cj.Session;
import com.mysql.cj.exceptions.ExceptionInterceptor;
import com.mysql.cj.jdbc.ClientPreparedStatement;
import com.mysql.cj.jdbc.JdbcConnection;
import com.mysql.cj.jdbc.JdbcPreparedStatement;
import com.mysql.cj.jdbc.JdbcStatement;
import com.mysql.cj.jdbc.ParameterBindings;
import com.mysql.cj.jdbc.result.ResultSetInternalMethods;
import com.mysql.cj.protocol.Message;
import com.mysql.cj.protocol.ProtocolEntityFactory;
import com.mysql.cj.protocol.Resultset;
import com.xweb.sql.mysql.SqlToMysqlUtil;
import lombok.Getter;
import lombok.Setter;
import lombok.val;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;


@Getter
@Setter
public class ExtendsStatement implements JdbcPreparedStatement, JdbcStatement {

    private ClientPreparedStatement clientPreparedStatement;


    public ExtendsStatement() {

    }

    public ExtendsStatement(ClientPreparedStatement clientPreparedStatement) throws SQLException {
        this.clientPreparedStatement = clientPreparedStatement;
    }


    @Override
    public QueryBindings<?> getQueryBindings() {
        return clientPreparedStatement.getQueryBindings();
    }

    @Override
    public String toString() {
        return clientPreparedStatement.toString();
    }

    @Override
    public void addBatch() throws SQLException {
        clientPreparedStatement.addBatch();
    }

    @Override
    public void addBatch(String sql) throws SQLException {
        clientPreparedStatement.addBatch(sql);
    }

    public String asSql() throws SQLException {
        return clientPreparedStatement.asSql();
    }

    public String asSql(boolean quoteStreamsAndUnknowns) throws SQLException {
        return clientPreparedStatement.asSql(quoteStreamsAndUnknowns);
    }

    @Override
    public void clearBatch() throws SQLException {
        clientPreparedStatement.clearBatch();
    }

    @Override
    public void clearParameters() throws SQLException {
        clientPreparedStatement.clearParameters();
    }

    @Override
    public boolean execute() throws SQLException {
        System.out.println("execute");
        final ClientPreparedQuery clientPreparedQuery = (ClientPreparedQuery) clientPreparedStatement.getQuery();
        return clientPreparedStatement.execute();
    }


    @Override
    public ResultSet executeQuery() throws SQLException {
        System.out.println(">>>>>>>>>>>real Sql:");
        return clientPreparedStatement.executeQuery();
    }

    @Override
    public int executeUpdate() throws SQLException {
        return clientPreparedStatement.executeUpdate();
    }

    @Override
    public byte[] getBytesRepresentation(int parameterIndex) throws SQLException {
        return clientPreparedStatement.getBytesRepresentation(parameterIndex);
    }

    @Override
    public byte[] getOrigBytes(int parameterIndex) throws SQLException {
        return clientPreparedStatement.getOrigBytes(parameterIndex);
    }

    @Override
    public ResultSetMetaData getMetaData() throws SQLException {
        return clientPreparedStatement.getMetaData();
    }


    @Override
    public ParameterMetaData getParameterMetaData() throws SQLException {
        return clientPreparedStatement.getParameterMetaData();
    }

    @Override
    public ParseInfo getParseInfo() {
        return clientPreparedStatement.getParseInfo();
    }

    @Override
    public boolean isNull(int paramIndex) throws SQLException {
        return clientPreparedStatement.isNull(paramIndex);
    }

    @Override
    public void realClose(boolean calledExplicitly, boolean closeOpenResults) throws SQLException {
        clientPreparedStatement.realClose(calledExplicitly, closeOpenResults);
    }

    @Override
    public String getPreparedSql() {
        return clientPreparedStatement.getPreparedSql();
    }

    @Override
    public int getUpdateCount() throws SQLException {
        return clientPreparedStatement.getUpdateCount();
    }

    @Override
    public long executeLargeUpdate() throws SQLException {
        return clientPreparedStatement.executeLargeUpdate();
    }

    @Override
    public ParameterBindings getParameterBindings() throws SQLException {
        return clientPreparedStatement.getParameterBindings();
    }


    @Override
    public void setArray(int i, Array x) throws SQLException {
        clientPreparedStatement.setArray(i, x);
    }

    @Override
    public void setAsciiStream(int parameterIndex, InputStream x) throws SQLException {
        clientPreparedStatement.setAsciiStream(parameterIndex, x);
    }

    @Override
    public void setAsciiStream(int parameterIndex, InputStream x, int length) throws SQLException {
        clientPreparedStatement.setAsciiStream(parameterIndex, x, length);
    }

    @Override
    public void setAsciiStream(int parameterIndex, InputStream x, long length) throws SQLException {
        clientPreparedStatement.setAsciiStream(parameterIndex, x, length);
    }

    @Override
    public void setBigDecimal(int parameterIndex, BigDecimal x) throws SQLException {
        clientPreparedStatement.setBigDecimal(parameterIndex, x);
    }

    @Override
    public void setBinaryStream(int parameterIndex, InputStream x) throws SQLException {
        clientPreparedStatement.setBinaryStream(parameterIndex, x);
    }

    @Override
    public void setBinaryStream(int parameterIndex, InputStream x, int length) throws SQLException {
        clientPreparedStatement.setBinaryStream(parameterIndex, x, length);
    }

    @Override
    public void setBinaryStream(int parameterIndex, InputStream x, long length) throws SQLException {
        clientPreparedStatement.setBinaryStream(parameterIndex, x, length);
    }

    @Override
    public void setBlob(int i, Blob x) throws SQLException {
        clientPreparedStatement.setBlob(i, x);
    }

    @Override
    public void setBlob(int parameterIndex, InputStream inputStream) throws SQLException {
        clientPreparedStatement.setBlob(parameterIndex, inputStream);
    }

    @Override
    public void setBlob(int parameterIndex, InputStream inputStream, long length) throws SQLException {
        clientPreparedStatement.setBlob(parameterIndex, inputStream, length);
    }

    @Override
    public void setBoolean(int parameterIndex, boolean x) throws SQLException {
        clientPreparedStatement.setBoolean(parameterIndex, x);
    }

    @Override
    public void setByte(int parameterIndex, byte x) throws SQLException {
        clientPreparedStatement.setByte(parameterIndex, x);
    }

    @Override
    public void setBytes(int parameterIndex, byte[] x) throws SQLException {
        clientPreparedStatement.setBytes(parameterIndex, x);
    }

    @Override
    public void setBytes(int parameterIndex, byte[] x, boolean checkForIntroducer, boolean escapeForMBChars) throws SQLException {
        clientPreparedStatement.setBytes(parameterIndex, x, checkForIntroducer, escapeForMBChars);
    }

    @Override
    public void setBytesNoEscape(int parameterIndex, byte[] parameterAsBytes) throws SQLException {
        clientPreparedStatement.setBytesNoEscape(parameterIndex, parameterAsBytes);
    }

    @Override
    public void setBytesNoEscapeNoQuotes(int parameterIndex, byte[] parameterAsBytes) throws SQLException {
        clientPreparedStatement.setBytesNoEscapeNoQuotes(parameterIndex, parameterAsBytes);
    }

    @Override
    public void setCharacterStream(int parameterIndex, Reader reader) throws SQLException {
        clientPreparedStatement.setCharacterStream(parameterIndex, reader);
    }

    @Override
    public void setCharacterStream(int parameterIndex, Reader reader, int length) throws SQLException {
        clientPreparedStatement.setCharacterStream(parameterIndex, reader, length);
    }

    @Override
    public void setCharacterStream(int parameterIndex, Reader reader, long length) throws SQLException {
        clientPreparedStatement.setCharacterStream(parameterIndex, reader, length);
    }

    @Override
    public void setClob(int parameterIndex, Reader reader) throws SQLException {
        clientPreparedStatement.setClob(parameterIndex, reader);
    }

    @Override
    public void setClob(int parameterIndex, Reader reader, long length) throws SQLException {
        clientPreparedStatement.setClob(parameterIndex, reader, length);
    }

    @Override
    public void setClob(int i, Clob x) throws SQLException {
        clientPreparedStatement.setClob(i, x);
    }

    @Override
    public void setDate(int parameterIndex, Date x) throws SQLException {
        clientPreparedStatement.setDate(parameterIndex, x);
    }

    @Override
    public void setDate(int parameterIndex, Date x, Calendar cal) throws SQLException {
        clientPreparedStatement.setDate(parameterIndex, x, cal);
    }

    @Override
    public void setDouble(int parameterIndex, double x) throws SQLException {
        clientPreparedStatement.setDouble(parameterIndex, x);
    }

    @Override
    public void setFloat(int parameterIndex, float x) throws SQLException {
        clientPreparedStatement.setFloat(parameterIndex, x);
    }

    @Override
    public void setInt(int parameterIndex, int x) throws SQLException {
        clientPreparedStatement.setInt(parameterIndex, x);
    }

    @Override
    public void setLong(int parameterIndex, long x) throws SQLException {
        clientPreparedStatement.setLong(parameterIndex, x);
    }

    @Override
    public void setBigInteger(int parameterIndex, BigInteger x) throws SQLException {
        clientPreparedStatement.setBigInteger(parameterIndex, x);
    }

    @Override
    public void setNCharacterStream(int parameterIndex, Reader value) throws SQLException {
        clientPreparedStatement.setNCharacterStream(parameterIndex, value);
    }

    @Override
    public void setNCharacterStream(int parameterIndex, Reader reader, long length) throws SQLException {
        clientPreparedStatement.setNCharacterStream(parameterIndex, reader, length);
    }

    @Override
    public void setNClob(int parameterIndex, Reader reader) throws SQLException {
        clientPreparedStatement.setNClob(parameterIndex, reader);
    }

    @Override
    public void setNClob(int parameterIndex, Reader reader, long length) throws SQLException {
        clientPreparedStatement.setNClob(parameterIndex, reader, length);
    }

    @Override
    public void setNClob(int parameterIndex, NClob value) throws SQLException {
        clientPreparedStatement.setNClob(parameterIndex, value);
    }

    @Override
    public void setNString(int parameterIndex, String x) throws SQLException {
        clientPreparedStatement.setNString(parameterIndex, x);
    }

    @Override
    public void setNull(int parameterIndex, int sqlType) throws SQLException {
        clientPreparedStatement.setNull(parameterIndex, sqlType);
    }

    @Override
    public void setNull(int parameterIndex, int sqlType, String typeName) throws SQLException {
        clientPreparedStatement.setNull(parameterIndex, sqlType, typeName);
    }

    @Override
    public void setNull(int parameterIndex, MysqlType mysqlType) throws SQLException {
        clientPreparedStatement.setNull(parameterIndex, mysqlType);
    }

    @Override
    public void setObject(int parameterIndex, Object parameterObj) throws SQLException {
        clientPreparedStatement.setObject(parameterIndex, parameterObj);
    }

    @Override
    public void setObject(int parameterIndex, Object parameterObj, int targetSqlType) throws SQLException {
        clientPreparedStatement.setObject(parameterIndex, parameterObj, targetSqlType);
    }

    @Override
    public void setObject(int parameterIndex, Object parameterObj, SQLType targetSqlType) throws SQLException {
        clientPreparedStatement.setObject(parameterIndex, parameterObj, targetSqlType);
    }

    @Override
    public void setObject(int parameterIndex, Object parameterObj, int targetSqlType, int scale) throws SQLException {
        clientPreparedStatement.setObject(parameterIndex, parameterObj, targetSqlType, scale);
    }

    @Override
    public void setObject(int parameterIndex, Object x, SQLType targetSqlType, int scaleOrLength) throws SQLException {
        clientPreparedStatement.setObject(parameterIndex, x, targetSqlType, scaleOrLength);
    }

    @Override
    public void setRef(int i, Ref x) throws SQLException {
        clientPreparedStatement.setRef(i, x);
    }

    @Override
    public void setRowId(int parameterIndex, RowId x) throws SQLException {
        clientPreparedStatement.setRowId(parameterIndex, x);
    }

    @Override
    public void setShort(int parameterIndex, short x) throws SQLException {
        clientPreparedStatement.setShort(parameterIndex, x);
    }

    @Override
    public void setSQLXML(int parameterIndex, SQLXML xmlObject) throws SQLException {
        clientPreparedStatement.setSQLXML(parameterIndex, xmlObject);
    }

    @Override
    public void setString(int parameterIndex, String x) throws SQLException {
        clientPreparedStatement.setString(parameterIndex, x);
    }

    @Override
    public void setTime(int parameterIndex, Time x) throws SQLException {
        clientPreparedStatement.setTime(parameterIndex, x);
    }

    @Override
    public void setTime(int parameterIndex, Time x, Calendar cal) throws SQLException {
        clientPreparedStatement.setTime(parameterIndex, x, cal);
    }

    @Override
    public void setTimestamp(int parameterIndex, Timestamp x) throws SQLException {
        clientPreparedStatement.setTimestamp(parameterIndex, x);
    }

    @Override
    public void setTimestamp(int parameterIndex, Timestamp x, Calendar cal) throws SQLException {
        clientPreparedStatement.setTimestamp(parameterIndex, x, cal);
    }

    public void setTimestamp(int parameterIndex, Timestamp x, Calendar targetCalendar, int fractionalLength) throws SQLException {
        clientPreparedStatement.setTimestamp(parameterIndex, x, targetCalendar, fractionalLength);
    }

    @Override
    public void setUnicodeStream(int parameterIndex, InputStream x, int length) throws SQLException {
        clientPreparedStatement.setUnicodeStream(parameterIndex, x, length);
    }

    @Override
    public void setURL(int parameterIndex, URL arg) throws SQLException {
        clientPreparedStatement.setURL(parameterIndex, arg);
    }

    @Override
    public void addBatch(Object batch) {
        clientPreparedStatement.addBatch(batch);
    }

    @Override
    public List<Object> getBatchedArgs() {
        return clientPreparedStatement.getBatchedArgs();
    }

    @Override
    public void cancel() throws SQLException {
        clientPreparedStatement.cancel();
    }


    @Override
    public void clearBatchedArgs() {
        clientPreparedStatement.clearBatchedArgs();
    }

    @Override
    public void clearWarnings() throws SQLException {
        clientPreparedStatement.clearWarnings();
    }

    @Override
    public void close() throws SQLException {
        clientPreparedStatement.close();
    }


    @Override
    public void removeOpenResultSet(ResultSetInternalMethods rs) {
        clientPreparedStatement.removeOpenResultSet(rs);
    }

    @Override
    public int getOpenResultSetCount() {
        return clientPreparedStatement.getOpenResultSetCount();
    }


    @Override
    public void enableStreamingResults() throws SQLException {
        clientPreparedStatement.enableStreamingResults();
    }

    @Override
    public void disableStreamingResults() throws SQLException {
        clientPreparedStatement.disableStreamingResults();
    }


    @Override
    public CancelQueryTask startQueryTimer(Query stmtToCancel, int timeout) {
        return clientPreparedStatement.startQueryTimer(stmtToCancel, timeout);
    }

    @Override
    public void stopQueryTimer(CancelQueryTask timeoutTask, boolean rethrowCancelReason, boolean checkCancelTimeout) {
        clientPreparedStatement.stopQueryTimer(timeoutTask, rethrowCancelReason, checkCancelTimeout);
    }

    @Override
    public boolean execute(String sql) throws SQLException {
        System.out.println("exectue:" + sql);
        return clientPreparedStatement.execute(sql);
    }

    @Override
    public void statementBegins() {
        clientPreparedStatement.statementBegins();
    }

    @Override
    public void resetCancelledState() {
        clientPreparedStatement.resetCancelledState();
    }

    @Override
    public boolean execute(String sql, int returnGeneratedKeys) throws SQLException {
        System.out.println("exectue2:" + sql);

        return clientPreparedStatement.execute(sql, returnGeneratedKeys);
    }

    @Override
    public boolean execute(String sql, int[] generatedKeyIndices) throws SQLException {
        System.out.println("exectue3:" + sql);

        return clientPreparedStatement.execute(sql, generatedKeyIndices);
    }

    @Override
    public boolean execute(String sql, String[] generatedKeyNames) throws SQLException {
        System.out.println("exectue32:" + sql);
        return clientPreparedStatement.execute(sql, generatedKeyNames);
    }

    @Override
    public int[] executeBatch() throws SQLException {
        return clientPreparedStatement.executeBatch();
    }


    @Override
    public ResultSet executeQuery(String sql) throws SQLException {
        System.out.println(">>>>>>>>>>>real Sql:" + sql);
        return clientPreparedStatement.executeQuery(sql);
    }


    public void executeSimpleNonQuery(JdbcConnection c, String nonQuery) throws SQLException {
        clientPreparedStatement.executeSimpleNonQuery(c, nonQuery);
    }

    @Override
    public int executeUpdate(String sql) throws SQLException {
        return clientPreparedStatement.executeUpdate(sql);
    }


    @Override
    public int executeUpdate(String sql, int autoGeneratedKeys) throws SQLException {
        return clientPreparedStatement.executeUpdate(sql, autoGeneratedKeys);
    }

    @Override
    public int executeUpdate(String sql, int[] columnIndexes) throws SQLException {
        return clientPreparedStatement.executeUpdate(sql, columnIndexes);
    }

    @Override
    public int executeUpdate(String sql, String[] columnNames) throws SQLException {
        return clientPreparedStatement.executeUpdate(sql, columnNames);
    }

    @Override
    public Connection getConnection() throws SQLException {
        return clientPreparedStatement.getConnection();
    }

    @Override
    public int getFetchDirection() throws SQLException {
        return clientPreparedStatement.getFetchDirection();
    }

    @Override
    public int getFetchSize() throws SQLException {
        return clientPreparedStatement.getFetchSize();
    }

    @Override
    public ResultSet getGeneratedKeys() throws SQLException {
        return clientPreparedStatement.getGeneratedKeys();
    }

    public long getLastInsertID() {
        return clientPreparedStatement.getLastInsertID();
    }

    public long getLongUpdateCount() {
        return clientPreparedStatement.getLongUpdateCount();
    }

    @Override
    public int getMaxFieldSize() throws SQLException {
        return clientPreparedStatement.getMaxFieldSize();
    }

    @Override
    public int getMaxRows() throws SQLException {
        return clientPreparedStatement.getMaxRows();
    }

    @Override
    public boolean getMoreResults() throws SQLException {
        return clientPreparedStatement.getMoreResults();
    }

    @Override
    public boolean getMoreResults(int current) throws SQLException {
        return clientPreparedStatement.getMoreResults(current);
    }

    @Override
    public int getQueryTimeout() throws SQLException {
        return clientPreparedStatement.getQueryTimeout();
    }

    @Override
    public ResultSet getResultSet() throws SQLException {
        return clientPreparedStatement.getResultSet();
    }

    @Override
    public int getResultSetConcurrency() throws SQLException {
        return clientPreparedStatement.getResultSetConcurrency();
    }

    @Override
    public int getResultSetHoldability() throws SQLException {
        return clientPreparedStatement.getResultSetHoldability();
    }

    @Override
    public int getResultSetType() throws SQLException {
        return clientPreparedStatement.getResultSetType();
    }

    @Override
    public SQLWarning getWarnings() throws SQLException {
        return clientPreparedStatement.getWarnings();
    }

    @Override
    public void setCursorName(String name) throws SQLException {
        clientPreparedStatement.setCursorName(name);
    }

    @Override
    public void setEscapeProcessing(boolean enable) throws SQLException {
        clientPreparedStatement.setEscapeProcessing(enable);
    }

    @Override
    public void setFetchDirection(int direction) throws SQLException {
        clientPreparedStatement.setFetchDirection(direction);
    }

    @Override
    public void setFetchSize(int rows) throws SQLException {
        clientPreparedStatement.setFetchSize(rows);
    }

    @Override
    public void setHoldResultsOpenOverClose(boolean holdResultsOpenOverClose) {
        clientPreparedStatement.setHoldResultsOpenOverClose(holdResultsOpenOverClose);
    }

    @Override
    public void setMaxFieldSize(int max) throws SQLException {
        clientPreparedStatement.setMaxFieldSize(max);
    }

    @Override
    public void setMaxRows(int max) throws SQLException {
        clientPreparedStatement.setMaxRows(max);
    }

    @Override
    public void setQueryTimeout(int seconds) throws SQLException {
        clientPreparedStatement.setQueryTimeout(seconds);
    }


    @Override
    public boolean isClosed() throws SQLException {
        return clientPreparedStatement.isClosed();
    }

    @Override
    public boolean isPoolable() throws SQLException {
        return clientPreparedStatement.isPoolable();
    }

    @Override
    public void setPoolable(boolean poolable) throws SQLException {
        clientPreparedStatement.setPoolable(poolable);
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return clientPreparedStatement.isWrapperFor(iface);
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return clientPreparedStatement.unwrap(iface);
    }

    @Override
    public InputStream getLocalInfileInputStream() {
        return clientPreparedStatement.getLocalInfileInputStream();
    }

    @Override
    public void setLocalInfileInputStream(InputStream stream) {
        clientPreparedStatement.setLocalInfileInputStream(stream);
    }

    @Override
    public void setPingTarget(PingTarget pingTarget) {
        clientPreparedStatement.setPingTarget(pingTarget);
    }

    @Override
    public ExceptionInterceptor getExceptionInterceptor() {
        return clientPreparedStatement.getExceptionInterceptor();
    }

    @Override
    public void closeOnCompletion() throws SQLException {
        clientPreparedStatement.closeOnCompletion();
    }

    @Override
    public boolean isCloseOnCompletion() throws SQLException {
        return clientPreparedStatement.isCloseOnCompletion();
    }

    @Override
    public long[] executeLargeBatch() throws SQLException {
        return clientPreparedStatement.executeLargeBatch();
    }

    @Override
    public long executeLargeUpdate(String sql) throws SQLException {
        return clientPreparedStatement.executeLargeUpdate(sql);
    }

    @Override
    public long executeLargeUpdate(String sql, int autoGeneratedKeys) throws SQLException {
        return clientPreparedStatement.executeLargeUpdate(sql, autoGeneratedKeys);
    }

    @Override
    public long executeLargeUpdate(String sql, int[] columnIndexes) throws SQLException {
        return clientPreparedStatement.executeLargeUpdate(sql, columnIndexes);
    }

    @Override
    public long executeLargeUpdate(String sql, String[] columnNames) throws SQLException {
        return clientPreparedStatement.executeLargeUpdate(sql, columnNames);
    }

    @Override
    public long getLargeMaxRows() throws SQLException {
        return clientPreparedStatement.getLargeMaxRows();
    }

    @Override
    public long getLargeUpdateCount() throws SQLException {
        return clientPreparedStatement.getLargeUpdateCount();
    }

    @Override
    public void setLargeMaxRows(long max) throws SQLException {
        clientPreparedStatement.setLargeMaxRows(max);
    }

    @Override
    public String getCurrentDatabase() {
        return clientPreparedStatement.getCurrentDatabase();
    }

    public long getServerStatementId() {
        return clientPreparedStatement.getServerStatementId();
    }

    @Override
    public <T extends Resultset, M extends Message> ProtocolEntityFactory<T, M> getResultSetFactory() {
        return clientPreparedStatement.getResultSetFactory();
    }

    @Override
    public int getId() {
        return clientPreparedStatement.getId();
    }

    @Override
    public void setCancelStatus(CancelStatus cs) {
        clientPreparedStatement.setCancelStatus(cs);
    }

    @Override
    public void checkCancelTimeout() {
        clientPreparedStatement.checkCancelTimeout();
    }

    @Override
    public Session getSession() {
        return clientPreparedStatement.getSession();
    }

    @Override
    public Object getCancelTimeoutMutex() {
        return clientPreparedStatement.getCancelTimeoutMutex();
    }

    @Override
    public void closeQuery() {
        clientPreparedStatement.closeQuery();
    }

    @Override
    public int getResultFetchSize() {
        return clientPreparedStatement.getResultFetchSize();
    }

    @Override
    public void setResultFetchSize(int fetchSize) {
        clientPreparedStatement.setResultFetchSize(fetchSize);
    }

    @Override
    public Resultset.Type getResultType() {
        return clientPreparedStatement.getResultType();
    }

    @Override
    public void setResultType(Resultset.Type resultSetType) {
        clientPreparedStatement.setResultType(resultSetType);
    }

    @Override
    public int getTimeoutInMillis() {
        return clientPreparedStatement.getTimeoutInMillis();
    }

    @Override
    public void setTimeoutInMillis(int timeoutInMillis) {
        clientPreparedStatement.setTimeoutInMillis(timeoutInMillis);
    }

    @Override
    public long getExecuteTime() {
        return clientPreparedStatement.getExecuteTime();
    }

    @Override
    public void setExecuteTime(long executeTime) {
        clientPreparedStatement.setExecuteTime(executeTime);
    }

    @Override
    public AtomicBoolean getStatementExecuting() {
        return clientPreparedStatement.getStatementExecuting();
    }

    @Override
    public void setCurrentDatabase(String currentDb) {
        clientPreparedStatement.setCurrentDatabase(currentDb);
    }

    @Override
    public boolean isClearWarningsCalled() {
        return clientPreparedStatement.isClearWarningsCalled();
    }

    @Override
    public void setClearWarningsCalled(boolean clearWarningsCalled) {
        clientPreparedStatement.setClearWarningsCalled(clearWarningsCalled);
    }

    @Override
    public Query getQuery() {
        return clientPreparedStatement.getQuery();
    }

    @Override
    public QueryAttributesBindings getQueryAttributesBindings() {
        return clientPreparedStatement.getQueryAttributesBindings();
    }

    @Override
    public void setAttribute(String name, Object value) {
        clientPreparedStatement.setAttribute(name, value);
    }

    @Override
    public void clearAttributes() {
        clientPreparedStatement.clearAttributes();
    }


}
