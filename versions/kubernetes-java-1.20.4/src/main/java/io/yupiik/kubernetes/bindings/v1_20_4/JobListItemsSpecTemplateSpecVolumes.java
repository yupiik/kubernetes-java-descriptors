package io.yupiik.kubernetes.bindings.v1_20_4;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecVolumes {
    private JobListItemsSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore;
    private JobListItemsSpecTemplateSpecVolumesAzureDisk azureDisk;
    private JobListItemsSpecTemplateSpecVolumesAzureFile azureFile;
    private JobListItemsSpecTemplateSpecVolumesCephfs cephfs;
    private JobListItemsSpecTemplateSpecVolumesCinder cinder;
    private JobListItemsSpecTemplateSpecVolumesConfigMap configMap;
    private JobListItemsSpecTemplateSpecVolumesCsi csi;
    private JobListItemsSpecTemplateSpecVolumesDownwardAPI downwardAPI;
    private JobListItemsSpecTemplateSpecVolumesEmptyDir emptyDir;
    private JobListItemsSpecTemplateSpecVolumesEphemeral ephemeral;
    private JobListItemsSpecTemplateSpecVolumesFc fc;
    private JobListItemsSpecTemplateSpecVolumesFlexVolume flexVolume;
    private JobListItemsSpecTemplateSpecVolumesFlocker flocker;
    private JobListItemsSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk;
    private JobListItemsSpecTemplateSpecVolumesGitRepo gitRepo;
    private JobListItemsSpecTemplateSpecVolumesGlusterfs glusterfs;
    private JobListItemsSpecTemplateSpecVolumesHostPath hostPath;
    private JobListItemsSpecTemplateSpecVolumesIscsi iscsi;
    private String name;
    private JobListItemsSpecTemplateSpecVolumesNfs nfs;
    private JobListItemsSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim;
    private JobListItemsSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk;
    private JobListItemsSpecTemplateSpecVolumesPortworxVolume portworxVolume;
    private JobListItemsSpecTemplateSpecVolumesProjected projected;
    private JobListItemsSpecTemplateSpecVolumesQuobyte quobyte;
    private JobListItemsSpecTemplateSpecVolumesRbd rbd;
    private JobListItemsSpecTemplateSpecVolumesScaleIO scaleIO;
    private JobListItemsSpecTemplateSpecVolumesSecret secret;
    private JobListItemsSpecTemplateSpecVolumesStorageos storageos;
    private JobListItemsSpecTemplateSpecVolumesVsphereVolume vsphereVolume;

    public JobListItemsSpecTemplateSpecVolumes() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecVolumes(final JobListItemsSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore,
                                               final JobListItemsSpecTemplateSpecVolumesAzureDisk azureDisk,
                                               final JobListItemsSpecTemplateSpecVolumesAzureFile azureFile,
                                               final JobListItemsSpecTemplateSpecVolumesCephfs cephfs,
                                               final JobListItemsSpecTemplateSpecVolumesCinder cinder,
                                               final JobListItemsSpecTemplateSpecVolumesConfigMap configMap,
                                               final JobListItemsSpecTemplateSpecVolumesCsi csi,
                                               final JobListItemsSpecTemplateSpecVolumesDownwardAPI downwardAPI,
                                               final JobListItemsSpecTemplateSpecVolumesEmptyDir emptyDir,
                                               final JobListItemsSpecTemplateSpecVolumesEphemeral ephemeral,
                                               final JobListItemsSpecTemplateSpecVolumesFc fc,
                                               final JobListItemsSpecTemplateSpecVolumesFlexVolume flexVolume,
                                               final JobListItemsSpecTemplateSpecVolumesFlocker flocker,
                                               final JobListItemsSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk,
                                               final JobListItemsSpecTemplateSpecVolumesGitRepo gitRepo,
                                               final JobListItemsSpecTemplateSpecVolumesGlusterfs glusterfs,
                                               final JobListItemsSpecTemplateSpecVolumesHostPath hostPath,
                                               final JobListItemsSpecTemplateSpecVolumesIscsi iscsi,
                                               final String name,
                                               final JobListItemsSpecTemplateSpecVolumesNfs nfs,
                                               final JobListItemsSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim,
                                               final JobListItemsSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk,
                                               final JobListItemsSpecTemplateSpecVolumesPortworxVolume portworxVolume,
                                               final JobListItemsSpecTemplateSpecVolumesProjected projected,
                                               final JobListItemsSpecTemplateSpecVolumesQuobyte quobyte,
                                               final JobListItemsSpecTemplateSpecVolumesRbd rbd,
                                               final JobListItemsSpecTemplateSpecVolumesScaleIO scaleIO,
                                               final JobListItemsSpecTemplateSpecVolumesSecret secret,
                                               final JobListItemsSpecTemplateSpecVolumesStorageos storageos,
                                               final JobListItemsSpecTemplateSpecVolumesVsphereVolume vsphereVolume) {
        // no-op
    }

    public JobListItemsSpecTemplateSpecVolumesAwsElasticBlockStore getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    public void setAwsElasticBlockStore(final JobListItemsSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    public JobListItemsSpecTemplateSpecVolumesAzureDisk getAzureDisk() {
        return azureDisk;
    }

    public void setAzureDisk(final JobListItemsSpecTemplateSpecVolumesAzureDisk azureDisk) {
        this.azureDisk = azureDisk;
    }

    public JobListItemsSpecTemplateSpecVolumesAzureFile getAzureFile() {
        return azureFile;
    }

    public void setAzureFile(final JobListItemsSpecTemplateSpecVolumesAzureFile azureFile) {
        this.azureFile = azureFile;
    }

    public JobListItemsSpecTemplateSpecVolumesCephfs getCephfs() {
        return cephfs;
    }

    public void setCephfs(final JobListItemsSpecTemplateSpecVolumesCephfs cephfs) {
        this.cephfs = cephfs;
    }

    public JobListItemsSpecTemplateSpecVolumesCinder getCinder() {
        return cinder;
    }

    public void setCinder(final JobListItemsSpecTemplateSpecVolumesCinder cinder) {
        this.cinder = cinder;
    }

    public JobListItemsSpecTemplateSpecVolumesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final JobListItemsSpecTemplateSpecVolumesConfigMap configMap) {
        this.configMap = configMap;
    }

    public JobListItemsSpecTemplateSpecVolumesCsi getCsi() {
        return csi;
    }

    public void setCsi(final JobListItemsSpecTemplateSpecVolumesCsi csi) {
        this.csi = csi;
    }

    public JobListItemsSpecTemplateSpecVolumesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final JobListItemsSpecTemplateSpecVolumesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public JobListItemsSpecTemplateSpecVolumesEmptyDir getEmptyDir() {
        return emptyDir;
    }

    public void setEmptyDir(final JobListItemsSpecTemplateSpecVolumesEmptyDir emptyDir) {
        this.emptyDir = emptyDir;
    }

    public JobListItemsSpecTemplateSpecVolumesEphemeral getEphemeral() {
        return ephemeral;
    }

    public void setEphemeral(final JobListItemsSpecTemplateSpecVolumesEphemeral ephemeral) {
        this.ephemeral = ephemeral;
    }

    public JobListItemsSpecTemplateSpecVolumesFc getFc() {
        return fc;
    }

    public void setFc(final JobListItemsSpecTemplateSpecVolumesFc fc) {
        this.fc = fc;
    }

    public JobListItemsSpecTemplateSpecVolumesFlexVolume getFlexVolume() {
        return flexVolume;
    }

    public void setFlexVolume(final JobListItemsSpecTemplateSpecVolumesFlexVolume flexVolume) {
        this.flexVolume = flexVolume;
    }

    public JobListItemsSpecTemplateSpecVolumesFlocker getFlocker() {
        return flocker;
    }

    public void setFlocker(final JobListItemsSpecTemplateSpecVolumesFlocker flocker) {
        this.flocker = flocker;
    }

    public JobListItemsSpecTemplateSpecVolumesGcePersistentDisk getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    public void setGcePersistentDisk(final JobListItemsSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    public JobListItemsSpecTemplateSpecVolumesGitRepo getGitRepo() {
        return gitRepo;
    }

    public void setGitRepo(final JobListItemsSpecTemplateSpecVolumesGitRepo gitRepo) {
        this.gitRepo = gitRepo;
    }

    public JobListItemsSpecTemplateSpecVolumesGlusterfs getGlusterfs() {
        return glusterfs;
    }

    public void setGlusterfs(final JobListItemsSpecTemplateSpecVolumesGlusterfs glusterfs) {
        this.glusterfs = glusterfs;
    }

    public JobListItemsSpecTemplateSpecVolumesHostPath getHostPath() {
        return hostPath;
    }

    public void setHostPath(final JobListItemsSpecTemplateSpecVolumesHostPath hostPath) {
        this.hostPath = hostPath;
    }

    public JobListItemsSpecTemplateSpecVolumesIscsi getIscsi() {
        return iscsi;
    }

    public void setIscsi(final JobListItemsSpecTemplateSpecVolumesIscsi iscsi) {
        this.iscsi = iscsi;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public JobListItemsSpecTemplateSpecVolumesNfs getNfs() {
        return nfs;
    }

    public void setNfs(final JobListItemsSpecTemplateSpecVolumesNfs nfs) {
        this.nfs = nfs;
    }

    public JobListItemsSpecTemplateSpecVolumesPersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(final JobListItemsSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    public JobListItemsSpecTemplateSpecVolumesPhotonPersistentDisk getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    public void setPhotonPersistentDisk(final JobListItemsSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    public JobListItemsSpecTemplateSpecVolumesPortworxVolume getPortworxVolume() {
        return portworxVolume;
    }

    public void setPortworxVolume(final JobListItemsSpecTemplateSpecVolumesPortworxVolume portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    public JobListItemsSpecTemplateSpecVolumesProjected getProjected() {
        return projected;
    }

    public void setProjected(final JobListItemsSpecTemplateSpecVolumesProjected projected) {
        this.projected = projected;
    }

    public JobListItemsSpecTemplateSpecVolumesQuobyte getQuobyte() {
        return quobyte;
    }

    public void setQuobyte(final JobListItemsSpecTemplateSpecVolumesQuobyte quobyte) {
        this.quobyte = quobyte;
    }

    public JobListItemsSpecTemplateSpecVolumesRbd getRbd() {
        return rbd;
    }

    public void setRbd(final JobListItemsSpecTemplateSpecVolumesRbd rbd) {
        this.rbd = rbd;
    }

    public JobListItemsSpecTemplateSpecVolumesScaleIO getScaleIO() {
        return scaleIO;
    }

    public void setScaleIO(final JobListItemsSpecTemplateSpecVolumesScaleIO scaleIO) {
        this.scaleIO = scaleIO;
    }

    public JobListItemsSpecTemplateSpecVolumesSecret getSecret() {
        return secret;
    }

    public void setSecret(final JobListItemsSpecTemplateSpecVolumesSecret secret) {
        this.secret = secret;
    }

    public JobListItemsSpecTemplateSpecVolumesStorageos getStorageos() {
        return storageos;
    }

    public void setStorageos(final JobListItemsSpecTemplateSpecVolumesStorageos storageos) {
        this.storageos = storageos;
    }

    public JobListItemsSpecTemplateSpecVolumesVsphereVolume getVsphereVolume() {
        return vsphereVolume;
    }

    public void setVsphereVolume(final JobListItemsSpecTemplateSpecVolumesVsphereVolume vsphereVolume) {
        this.vsphereVolume = vsphereVolume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                awsElasticBlockStore,
                azureDisk,
                azureFile,
                cephfs,
                cinder,
                configMap,
                csi,
                downwardAPI,
                emptyDir,
                ephemeral,
                fc,
                flexVolume,
                flocker,
                gcePersistentDisk,
                gitRepo,
                glusterfs,
                hostPath,
                iscsi,
                name,
                nfs,
                persistentVolumeClaim,
                photonPersistentDisk,
                portworxVolume,
                projected,
                quobyte,
                rbd,
                scaleIO,
                secret,
                storageos,
                vsphereVolume);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof JobListItemsSpecTemplateSpecVolumes)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecVolumes __otherCasted = (JobListItemsSpecTemplateSpecVolumes) __other;
        return Objects.equals(awsElasticBlockStore, __otherCasted.awsElasticBlockStore) &&
            Objects.equals(azureDisk, __otherCasted.azureDisk) &&
            Objects.equals(azureFile, __otherCasted.azureFile) &&
            Objects.equals(cephfs, __otherCasted.cephfs) &&
            Objects.equals(cinder, __otherCasted.cinder) &&
            Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(csi, __otherCasted.csi) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(emptyDir, __otherCasted.emptyDir) &&
            Objects.equals(ephemeral, __otherCasted.ephemeral) &&
            Objects.equals(fc, __otherCasted.fc) &&
            Objects.equals(flexVolume, __otherCasted.flexVolume) &&
            Objects.equals(flocker, __otherCasted.flocker) &&
            Objects.equals(gcePersistentDisk, __otherCasted.gcePersistentDisk) &&
            Objects.equals(gitRepo, __otherCasted.gitRepo) &&
            Objects.equals(glusterfs, __otherCasted.glusterfs) &&
            Objects.equals(hostPath, __otherCasted.hostPath) &&
            Objects.equals(iscsi, __otherCasted.iscsi) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(nfs, __otherCasted.nfs) &&
            Objects.equals(persistentVolumeClaim, __otherCasted.persistentVolumeClaim) &&
            Objects.equals(photonPersistentDisk, __otherCasted.photonPersistentDisk) &&
            Objects.equals(portworxVolume, __otherCasted.portworxVolume) &&
            Objects.equals(projected, __otherCasted.projected) &&
            Objects.equals(quobyte, __otherCasted.quobyte) &&
            Objects.equals(rbd, __otherCasted.rbd) &&
            Objects.equals(scaleIO, __otherCasted.scaleIO) &&
            Objects.equals(secret, __otherCasted.secret) &&
            Objects.equals(storageos, __otherCasted.storageos) &&
            Objects.equals(vsphereVolume, __otherCasted.vsphereVolume);
    }
}
