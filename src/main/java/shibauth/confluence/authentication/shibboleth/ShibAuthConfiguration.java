/*
 Copyright (c) 2008, Shibboleth Authenticator for Confluence Team
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions are met:

 * Redistributions of source code must retain the above copyright notice,
   this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
   notice, this list of conditions and the following disclaimer in the
   documentation and/or other materials provided with the distribution.
 * Neither the name of the Shibboleth Authenticator for Confluence Team
   nor the names of its contributors may be used to endorse or promote
   products derived from this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 POSSIBILITY OF SUCH DAMAGE.
 */

package shibauth.confluence.authentication.shibboleth;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class ShibAuthConfiguration {

    /**
     * Set of header names to be watchfull for dynamic roles
     */
    private Set attribHeaders;

    /**
     * Whether to create accounts for new users or not
     */
    private boolean createUsers;

    /**
     * Default roles for newly created users
     */
    private List defaultRoles;

    /**
     * Roles to be purged automatically of users who don't have attributes to regain membership anymore
     */
    private List purgeRoles;

    /**
     * Automatically reload the configuration file when changed
     */
    private boolean reloadConfig;

    /**
     * When reloading the configuration file, how long to wait (in milliseconds) between
     * checking the configuration file for changes?
     */
    private long reloadConfigCheckInterval;

    /**
     * Name of the configuration file to be reloaded
     */
    private String configFile;

    /**
     * Last modified stamp of the configuration file
     */
    private long configFileLastModified;

    /**
     * System time at when the configuration file was checked the last time
     */
    private long configFileLastChecked;

    /**
     * HTTP Header name that contains a user's email address
     */
    private String emailHeaderName;

    /**
     * HTTP Header name that contains a user's full name
     */
    private String fullNameHeaderName;

    /**
     * Mapping of a value of one of the
     */
    private Map mapRole = new HashMap(10);

    /**
     * Whether or not to update name/email info for previously created users
     */
    private static boolean updateInfo;

    /**
     * Whether to update roles for new users or not
     */
    private static boolean updateRoles;

    /**
     * Whether to convert fields to UTF8
     */
    private boolean convertToUTF8;

    /**
     * Whether to update last and previous login OS user properties (these are also used if using atlassian-user schema).
     */
    private boolean updateLastLogin;

    public Set getAttribHeaders() {
        return attribHeaders;
    }

    public void setAttribHeaders(Set attribHeaders) {
        this.attribHeaders = attribHeaders;
    }

    public boolean isCreateUsers() {
        return createUsers;
    }

    public void setCreateUsers(boolean createUsers) {
        this.createUsers = createUsers;
    }

    public List getDefaultRoles() {
        return defaultRoles;
    }

    public void setDefaultRoles(List defaultRoles) {
        this.defaultRoles = defaultRoles;
    }

    public List getPurgeRoles() {
        return purgeRoles;
    }

    public void setPurgeRoles(List purgeRoles) {
        this.purgeRoles = purgeRoles;
    }

    public boolean isReloadConfig() {
        return reloadConfig;
    }

    public void setReloadConfig(boolean reloadConfig) {
        this.reloadConfig = reloadConfig;
    }

    public long getReloadConfigCheckInterval() {
        return reloadConfigCheckInterval;
    }

    public void setReloadConfigCheckInterval(long reloadConfigCheckInterval) {
        this.reloadConfigCheckInterval = reloadConfigCheckInterval;
    }

    public String getConfigFile() {
        return configFile;
    }

    public void setConfigFile(String configFile) {
        this.configFile = configFile;
    }

    public long getConfigFileLastModified() {
        return configFileLastModified;
    }

    public void setConfigFileLastModified(long configFileLastModified) {
        this.configFileLastModified = configFileLastModified;
    }

    public long getConfigFileLastChecked() {
        return configFileLastChecked;
    }

    public void setConfigFileLastChecked(long configFileLastChecked) {
        this.configFileLastChecked = configFileLastChecked;
    }

    public String getEmailHeaderName() {
        return emailHeaderName;
    }

    public void setEmailHeaderName(String emailHeaderName) {
        this.emailHeaderName = emailHeaderName;
    }

    public String getFullNameHeaderName() {
        return fullNameHeaderName;
    }

    public void setFullNameHeaderName(String fullNameHeaderName) {
        this.fullNameHeaderName = fullNameHeaderName;
    }

    public Map getMapRole() {
        return mapRole;
    }

    public void setMapRole(Map mapRole) {
        this.mapRole = mapRole;
    }

    public static boolean isUpdateInfo() {
        return updateInfo;
    }

    public static void setUpdateInfo(boolean updateInfo) {
        ShibAuthConfiguration.updateInfo = updateInfo;
    }

    public static boolean isUpdateRoles() {
        return updateRoles;
    }

    public static void setUpdateRoles(boolean updateRoles) {
        ShibAuthConfiguration.updateRoles = updateRoles;
    }

    public boolean isConvertToUTF8() {
        return convertToUTF8;
    }

    public void setConvertToUTF8(boolean convertToUTF8) {
        convertToUTF8 = convertToUTF8;
    }

    public boolean isUpdateLastLogin() {
        return updateLastLogin;
    }

    public void setUpdateLastLogin(boolean updateLastLogin) {
        this.updateLastLogin = updateLastLogin;
    }
}
