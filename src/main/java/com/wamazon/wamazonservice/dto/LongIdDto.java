package com.wamazon.wamazonservice.dto;

public abstract class LongIdDto {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LongIdDto longIdDto = (LongIdDto) o;

        return id.equals(longIdDto.id);
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
