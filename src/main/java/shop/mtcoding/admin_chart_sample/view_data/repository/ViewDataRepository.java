package shop.mtcoding.admin_chart_sample.view_data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import shop.mtcoding.admin_chart_sample.connection_data.repository.ConnectionDataCustomRepository;
import shop.mtcoding.admin_chart_sample.view_data.entity.ViewData;

public interface ViewDataRepository extends JpaRepository<ViewData, Long>, ConnectionDataCustomRepository {
    List<ViewData> findByYearAndMonth(Integer year, Integer month);
}
